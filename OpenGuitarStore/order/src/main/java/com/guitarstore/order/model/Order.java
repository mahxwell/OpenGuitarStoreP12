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

    public Order(String order_date,
                 Date order_delivery_date,
                 Integer costumer_id_costumer,
                 Integer guitarmodel_id_guitarmodel) {
        this.order_date = order_date;
        this.order_delivery_date = order_delivery_date;
        this.costumer_id_costumer = costumer_id_costumer;
        this.guitarmodel_id_guitarmodel = guitarmodel_id_guitarmodel;
    }

    /**
     * ATTRIBUTS
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "costumerorder_id")
    private Integer order_id;

    @Column(name = "costumerorder_date")
    private String order_date;

    @Column(name = "costumerorder_delivery_date")
    private Date order_delivery_date;

    @Column(name = "costumer_id_costumer")
    private Integer costumer_id_costumer;

    @Column(name = "guitarmodel_id_guitarmodel")
    private Integer guitarmodel_id_guitarmodel;

    /**
     * GETTERS AND SETTERS
     */
    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public Date getOrder_delivery_date() {
        return order_delivery_date;
    }

    public void setOrder_delivery_date(Date order_delivery_date) {
        this.order_delivery_date = order_delivery_date;
    }

    public Integer getCostumer_id_costumer() {
        return costumer_id_costumer;
    }

    public void setCostumer_id_costumer(Integer costumer_id_costumer) {
        this.costumer_id_costumer = costumer_id_costumer;
    }

    public Integer getGuitarmodel_id_guitarmodel() {
        return guitarmodel_id_guitarmodel;
    }

    public void setGuitarmodel_id_guitarmodel(Integer guitarmodel_id_guitarmodel) {
        this.guitarmodel_id_guitarmodel = guitarmodel_id_guitarmodel;
    }

    /**
     * TOSTRING
     */

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", order_date='" + order_date + '\'' +
                ", order_delivery_date=" + order_delivery_date +
                ", costumer_id_costumer=" + costumer_id_costumer +
                ", guitarmodel_id_guitarmodel=" + guitarmodel_id_guitarmodel +
                '}';
    }
}
