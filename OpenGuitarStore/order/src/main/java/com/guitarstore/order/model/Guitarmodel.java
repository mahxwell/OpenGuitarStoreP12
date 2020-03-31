package com.guitarstore.order.model;

import javax.persistence.*;

@Entity
@Table(name = "guitarmodel")
public class Guitarmodel {

    /**
     * CONSTRUCTOR
     */

    public Guitarmodel() {
    }

    public Guitarmodel(Integer guitaridguitar) {
        this.guitaridguitar = guitaridguitar;
    }

    /**
     * ATTRIBUTS
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guitarmodel_id")
    private Integer guitarmodelid;

    @Column(name = "guitar_id_guitar")
    private Integer guitaridguitar;


    /**
     * GETTERS AND SETTERS
     */

    public Integer getGuitarmodelid() {
        return guitarmodelid;
    }

    public void setGuitarmodelid(Integer guitarmodelid) {
        this.guitarmodelid = guitarmodelid;
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
        return "Guitarmodel{" +
                "guitarmodelid=" + guitarmodelid +
                ", guitaridguitar=" + guitaridguitar +
                '}';
    }
}
