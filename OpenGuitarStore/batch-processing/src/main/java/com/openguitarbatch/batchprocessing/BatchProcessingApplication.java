package com.openguitarbatch.batchprocessing;

import com.openguitarbatch.batchprocessing.dao.GuitarmodelDao;
import com.openguitarbatch.batchprocessing.dao.ReservationDao;
import com.openguitarbatch.batchprocessing.dao.UserDao;
import com.openguitarbatch.batchprocessing.mail.JavaMailSenderUser;
import com.openguitarbatch.batchprocessing.model.Guitarmodel;
import com.openguitarbatch.batchprocessing.model.Reservation;
import com.openguitarbatch.batchprocessing.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

@SpringBootApplication
public class BatchProcessingApplication implements CommandLineRunner {

    @Autowired
    UserDao userDao;

    @Autowired
    ReservationDao reservationDao;

    @Autowired
    GuitarmodelDao guitarmodelDao;


    public static void main(String[] args) {
        SpringApplication.run(BatchProcessingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        taskRunner();
    }

    public void taskRunner() {

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

        Runnable taskNewsletter = () -> {
            try {
                List<User> users = userDao.findAll();
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i).isNewsletter() == true) {
                        JavaMailSenderUser.sendMessageToUserForNewsLetter(users.get(i).getMail(),
                                users.get(i).getPseudo());
                    }
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        };

        Runnable taskReservation = () -> {
            try {
                List<Reservation> reservations = reservationDao.findAll();
                for (int i = 0; i < reservations.size(); i++) {
                    List<Guitarmodel> guitarmodels = guitarmodelDao.findStock(reservations.get(i).getGuitaridguitar());
                    if (guitarmodels.size() > 0) {
                        User user = userDao.findUserById(reservations.get(i).getCostumeridcostumer());
                        JavaMailSenderUser.sendMessageToUserForReservation(user.getMail(), user.getPseudo(),
                                reservations.get(i).getGuitarbrand(), reservations.get(i).getGuitarname());
                        reservationDao.deleteById(reservations.get(i).getReservationid());
                    }
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        };
        ses.scheduleAtFixedRate(taskNewsletter, 0, 10, SECONDS);
        ses.scheduleAtFixedRate(taskReservation, 0, 10, SECONDS);
    }
}
