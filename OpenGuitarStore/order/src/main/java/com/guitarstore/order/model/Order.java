package com.guitarstore.order.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "costumerorder")
public class Order {

    /**
     * CONSTRUCTOR
     */

    public Order() {
    }

    public Order(String orderdate,
                 Date orderdeliverydate,
                 Integer costumeridcostumer,
                 Integer guitarmodelidguitarmodel) {
        this.orderdate = orderdate;
        this.orderdeliverydate = orderdeliverydate;
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
    private Date orderdeliverydate;

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

    public Date getOrderdeliverydate() {
        return orderdeliverydate;
    }

    public void setOrderdeliverydate(Date orderdeliverydate) {
        this.orderdeliverydate = orderdeliverydate;
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
                ", orderdeliverydate=" + orderdeliverydate +
                ", costumeridcostumer=" + costumeridcostumer +
                ", guitarmodelidguitarmodel=" + guitarmodelidguitarmodel +
                '}';
    }
}
