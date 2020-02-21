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

    public Guitar(String guitar_name,
                  String guitar_description,
                  Integer guitar_year,
                  Integer image_id_image,
                  Integer manufacturer_id_manufacturer,
                  Integer guitar_price,
                  boolean guitar_status) {
        this.guitar_name = guitar_name;
        this.guitar_description = guitar_description;
        this.guitar_year = guitar_year;
        this.image_id_image = image_id_image;
        this.manufacturer_id_manufacturer = manufacturer_id_manufacturer;
        this.guitar_price = guitar_price;
        this.guitar_status = guitar_status;
    }

    /**
     * ATTRIBUTS
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guitar_id")
    private Integer guitar_id;

    @Column(name = "guitar_name")
    private String guitar_name;

    @Column(name = "guitar_description")
    private String guitar_description;

    @Column(name = "guitar_year")
    private Integer guitar_year;

    @Column(name = "guitar_price")
    private Integer guitar_price;

    @Column(name = "guitar_status")
    private boolean guitar_status;

    @Column(name = "image_id_image")
    private Integer image_id_image;

    @Column(name = "manufacturer_id_manufacturer")
    private Integer manufacturer_id_manufacturer;


    /**
     * GETTERS AND SETTERS
     */
    public Integer getGuitar_id() {
        return guitar_id;
    }

    public void setGuitar_id(Integer guitar_id) {
        this.guitar_id = guitar_id;
    }

    public String getGuitar_name() {
        return guitar_name;
    }

    public void setGuitar_name(String guitar_name) {
        this.guitar_name = guitar_name;
    }

    public String getGuitar_description() {
        return guitar_description;
    }

    public void setGuitar_description(String guitar_description) {
        this.guitar_description = guitar_description;
    }

    public Integer getGuitar_year() {
        return guitar_year;
    }

    public void setGuitar_year(Integer guitar_year) {
        this.guitar_year = guitar_year;
    }

    public Integer getImage_id_image() {
        return image_id_image;
    }

    public void setImage_id_image(Integer image_id_image) {
        this.image_id_image = image_id_image;
    }

    public Integer getManufacturer_id_manufacturer() {
        return manufacturer_id_manufacturer;
    }

    public void setManufacturer_id_manufacturer(Integer manufacturer_id_manufacturer) {
        this.manufacturer_id_manufacturer = manufacturer_id_manufacturer;
    }

    public float getGuitar_price() {
        return guitar_price;
    }

    public void setGuitar_price(Integer guitar_price) {
        this.guitar_price = guitar_price;
    }

    public boolean isGuitar_status() {
        return guitar_status;
    }

    public void setGuitar_status(boolean guitar_status) {
        this.guitar_status = guitar_status;
    }

    /**
     * TOSTRING
     */

    @Override
    public String toString() {
        return "Guitar{" +
                "guitar_id=" + guitar_id +
                ", guitar_name='" + guitar_name + '\'' +
                ", guitar_description='" + guitar_description + '\'' +
                ", guitar_year=" + guitar_year +
                ", image_id_image=" + image_id_image +
                ", manufacturer_id_manufacturer=" + manufacturer_id_manufacturer +
                ", guitar_price=" + guitar_price +
                ", guitar_status=" + guitar_status +
                '}';
    }
}