package com.guitarstore.order.model;

import javax.persistence.*;

@Entity
@Table(name = "costumerorder")
public class Order {

    /**
     * CONSTRUCTOR
     */

    public Order() {
    }

    public Order(String orderdate,
                 String orderdeliverydate,
                 String guitarneme,
                 Integer guitaridguitar,
                 Integer costumeridcostumer,
                 Integer guitarmodelidguitarmodel) {
        this.orderdate = orderdate;
        this.orderdeliverydate = orderdeliverydate;
        this.guitarneme = guitarneme;
        this.guitaridguitar = guitaridguitar;
        this.costumeridcostumer = costumeridcostumer;
        this.guitarmodelidguitarmodel = guitarmodelidguitarmodel;
    }

    /**
     * ATTRIBUTS
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "costumerorder_id")
    private Integer orderid;

    @Column(name = "costumerorder_date")
    private String orderdate;

    @Column(name = "costumerorder_delivery_date")
    private String orderdeliverydate;

    @Column(name = "guitar_name")
    private String guitarneme;

    @Column(name = "guitar_id_guitar")
    private Integer guitaridguitar;

    @Column(name = "costumer_id_costumer")
    private Integer costumeridcostumer;

    @Column(name = "guitarmodel_id_guitarmodel")
    private Integer guitarmodelidguitarmodel;

    /**
     * GETTERS AND SETTERS
     */

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getOrderdeliverydate() {
        return orderdeliverydate;
    }

    public void setOrderdeliverydate(String orderdeliverydate) {
        this.orderdeliverydate = orderdeliverydate;
    }

    public String getGuitarneme() {
        return guitarneme;
    }

    public void setGuitarneme(String guitarneme) {
        this.guitarneme = guitarneme;
    }

    public Integer getGuitaridguitar() {
        return guitaridguitar;
    }

    public void setGuitaridguitar(Integer guitaridguitar) {
        this.guitaridguitar = guitaridguitar;
    }

    public Integer getCostumeridcostumer() {
        return costumeridcostumer;
    }

    public void setCostumeridcostumer(Integer costumeridcostumer) {
        this.costumeridcostumer = costumeridcostumer;
    }

    public Integer getGuitarmodelidguitarmodel() {
        return guitarmodelidguitarmodel;
    }

    public void setGuitarmodelidguitarmodel(Integer guitarmodelidguitarmodel) {
        this.guitarmodelidguitarmodel = guitarmodelidguitarmodel;
    }

    /**
     * TOSTRING
     */

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", orderdate='" + orderdate + '\'' +
                ", orderdeliverydate='" + orderdeliverydate + '\'' +
                ", guitarneme='" + guitarneme + '\'' +
                ", guitaridguitar=" + guitaridguitar +
                ", costumeridcostumer=" + costumeridcostumer +
                ", guitarmodelidguitarmodel=" + guitarmodelidguitarmodel +
                '}';
    }
}
