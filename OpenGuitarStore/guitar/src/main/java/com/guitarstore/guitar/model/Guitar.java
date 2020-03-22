package com.guitarstore.guitar.model;

import javax.persistence.*;

@Entity
@Table(name = "guitar")
public class Guitar {

    /**
     * CONSTRUCTOR
     */

    public Guitar() {
    }

    public Guitar(String guitarname,
                  String guitardescription,
                  Integer guitaryear,
                  String guitarprice,
                  boolean guitarstatus,
                  Integer imageidimage,
                  Integer manufactureridmanufacturer) {
        this.guitarname = guitarname;
        this.guitardescription = guitardescription;
        this.guitaryear = guitaryear;
        this.guitarprice = guitarprice;
        this.guitarstatus = guitarstatus;
        this.imageidimage = imageidimage;
        this.manufactureridmanufacturer = manufactureridmanufacturer;
    }


    /**
     * ATTRIBUTS
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guitar_id")
    private Integer guitarid;

    @Column(name = "guitar_name")
    private String guitarname;

    @Column(name = "guitar_description")
    private String guitardescription;

    @Column(name = "guitar_year")
    private Integer guitaryear;

    @Column(name = "guitar_price")
    private String guitarprice;

    @Column(name = "guitar_status")
    private boolean guitarstatus;

    @Column(name = "image_id_image")
    private Integer imageidimage;

    @Column(name = "manufacturer_id_manufacturer")
    private Integer manufactureridmanufacturer;


    /**
     * GETTERS AND SETTERS
     */

    public Integer getGuitarid() {
        return guitarid;
    }

    public void setGuitarid(Integer guitarid) {
        this.guitarid = guitarid;
    }

    public String getGuitarname() {
        return guitarname;
    }

    public void setGuitarname(String guitarname) {
        this.guitarname = guitarname;
    }

    public String getGuitardescription() {
        return guitardescription;
    }

    public void setGuitardescription(String guitardescription) {
        this.guitardescription = guitardescription;
    }

    public Integer getGuitaryear() {
        return guitaryear;
    }

    public void setGuitaryear(Integer guitaryear) {
        this.guitaryear = guitaryear;
    }

    public String getGuitarprice() {
        return guitarprice;
    }

    public void setGuitarprice(String guitarprice) {
        this.guitarprice = guitarprice;
    }

    public boolean isGuitarstatus() {
        return guitarstatus;
    }

    public void setGuitarstatus(boolean guitarstatus) {
        this.guitarstatus = guitarstatus;
    }

    public Integer getImageidimage() {
        return imageidimage;
    }

    public void setImageidimage(Integer imageidimage) {
        this.imageidimage = imageidimage;
    }

    public Integer getManufactureridmanufacturer() {
        return manufactureridmanufacturer;
    }

    public void setManufactureridmanufacturer(Integer manufactureridmanufacturer) {
        this.manufactureridmanufacturer = manufactureridmanufacturer;
    }

    /**
     * TOSTRING
     */
    @Override
    public String toString() {
        return "Guitar{" +
                "guitarid=" + guitarid +
                ", guitarname='" + guitarname + '\'' +
                ", guitardescription='" + guitardescription + '\'' +
                ", guitaryear=" + guitaryear +
                ", guitarprice='" + guitarprice + '\'' +
                ", guitarstatus=" + guitarstatus +
                ", imageidimage=" + imageidimage +
                ", manufactureridmanufacturer=" + manufactureridmanufacturer +
                '}';
    }
}
