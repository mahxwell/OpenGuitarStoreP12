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

    public Reservation(Integer costumer_id_costumer,
                       Integer guitar_id_guitar) {
        this.costumer_id_costumer = costumer_id_costumer;
        this.guitar_id_guitar = guitar_id_guitar;
    }

    /**
     * ATTRIBUTS
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private Integer reservation_id;

    @Column(name = "costumer_id_costumer")
    private Integer costumer_id_costumer;

    @Column(name = "guitar_id_guitar")
    private Integer guitar_id_guitar;


    /**
     * GETTERS AND SETTERS
     */


    public Integer getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(Integer reservation_id) {
        this.reservation_id = reservation_id;
    }

    public Integer getCostumer_id_costumer() {
        return costumer_id_costumer;
    }

    public void setCostumer_id_costumer(Integer costumer_id_costumer) {
        this.costumer_id_costumer = costumer_id_costumer;
    }

    public Integer getGuitar_id_guitar() {
        return guitar_id_guitar;
    }

    public void setGuitar_id_guitar(Integer guitar_id_guitar) {
        this.guitar_id_guitar = guitar_id_guitar;
    }

    /**
     * TOSTRING
     */

    @Override
    public String toString() {
        return "Reservation{" +
                "reservation_id=" + reservation_id +
                ", costumer_id_costumer=" + costumer_id_costumer +
                ", guitar_id_guitar=" + guitar_id_guitar +
                '}';
    }
}
