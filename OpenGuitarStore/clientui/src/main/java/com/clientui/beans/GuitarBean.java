package com.clientui.beans;

public class GuitarBean {

    public GuitarBean() {
    }

    private Integer guitar_id;

    private String guitar_name;

    private String guitar_description;

    private Integer guitar_year;

    private boolean guitar_status;

    private Integer guitar_price;

    private Integer image_id_image;

    private Integer manufacturer_id_manufacturer;


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

    public boolean isGuitar_status() {
        return guitar_status;
    }

    public void setGuitar_status(boolean guitar_status) {
        this.guitar_status = guitar_status;
    }

    public Integer getGuitar_price() {
        return guitar_price;
    }

    public void setGuitar_price(Integer guitar_price) {
        this.guitar_price = guitar_price;
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

    @Override
    public String toString() {
        return "GuitarBean{" +
                "guitar_id=" + guitar_id +
                ", guitar_name='" + guitar_name + '\'' +
                ", guitar_description='" + guitar_description + '\'' +
                ", guitar_year=" + guitar_year +
                ", guitar_status=" + guitar_status +
                ", guitar_price=" + guitar_price +
                ", image_id_image=" + image_id_image +
                ", manufacturer_id_manufacturer=" + manufacturer_id_manufacturer +
                '}';
    }
}
