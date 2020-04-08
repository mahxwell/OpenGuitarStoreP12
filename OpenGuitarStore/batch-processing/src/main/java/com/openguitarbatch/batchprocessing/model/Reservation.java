package com.openguitarbatch.batchprocessing.model;

import javax.persistence.*;

@Entity
@Table(name = "reservation")
public class Reservation {

    /**
     * CONSTRUCTOR
     */
    public Reservation() {
    }

    public Reservation(String guitarbrand,
                       String guitarname,
                       String guitarimageurl,
                       String deliverydate,
                       Integer costumeridcostumer,
                       Integer guitaridguitar) {
        this.guitarbrand = guitarbrand;
        this.guitarname = guitarname;
        this.guitarimageurl = guitarimageurl;
        this.deliverydate = deliverydate;
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

    @Column(name = "guitar_brand")
    private String guitarbrand;

    @Column(name = "guitar_name")
    private String guitarname;

    @Column(name = "guitar_image_url")
    private String guitarimageurl;

    @Column(name = "delivery_date")
    private String deliverydate;

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

    public String getGuitarbrand() {
        return guitarbrand;
    }

    public void setGuitarbrand(String guitarbrand) {
        this.guitarbrand = guitarbrand;
    }

    public String getGuitarname() {
        return guitarname;
    }

    public void setGuitarname(String guitarname) {
        this.guitarname = guitarname;
    }

    public String getGuitarimageurl() {
        return guitarimageurl;
    }

    public void setGuitarimageurl(String guitarimageurl) {
        this.guitarimageurl = guitarimageurl;
    }

    public String getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(String deliverydate) {
        this.deliverydate = deliverydate;
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
                ", guitarbrand=" + guitarbrand +
                ", guitarname=" + guitarname +
                ", guitarimageurl=" + guitarimageurl +
                ", deliverydate=" + deliverydate +
                ", costumeridcostumer=" + costumeridcostumer +
                ", guitaridguitar=" + guitaridguitar +
                '}';
    }
}
