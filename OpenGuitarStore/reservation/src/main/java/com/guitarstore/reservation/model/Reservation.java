package com.guitarstore.reservation.model;

import javax.persistence.*;

@Entity
@Table(name = "reservation")
public class Reservation {

    /**
     * CONSTRUCTOR
     */
    public Reservation() {
    }

    public Reservation(Integer costumeridcostumer, Integer guitaridguitar) {
        this.costumeridcostumer = costumeridcostumer;
        this.guitaridguitar = guitaridguitar;
    }

    /**
     * ATTRIBUTS
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private Integer reservationid;

    @Column(name = "costumer_id_costumer")
    private Integer costumeridcostumer;

    @Column(name = "guitar_id_guitar")
    private Integer guitaridguitar;


    /**
     * GETTERS AND SETTERS
     */


    public Integer getReservationid() {
        return reservationid;
    }

    public void setReservationid(Integer reservationid) {
        this.reservationid = reservationid;
    }

    public Integer getCostumeridcostumer() {
        return costumeridcostumer;
    }

    public void setCostumeridcostumer(Integer costumeridcostumer) {
        this.costumeridcostumer = costumeridcostumer;
    }

    public Integer getGuitaridguitar() {
        return guitaridguitar;
    }

    public void setGuitaridguitar(Integer guitaridguitar) {
        this.guitaridguitar = guitaridguitar;
    }

    /**
     * TOSTRING
     */

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationid=" + reservationid +
                ", costumeridcostumer=" + costumeridcostumer +
                ", guitaridguitar=" + guitaridguitar +
                '}';
    }
}
