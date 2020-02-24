package com.guitarstore.estimate.model;

import javax.persistence.*;

@Entity
@Table(name = "guitarestimation")
public class Estimate {


    /**
     * CONSTRUCTOR
     */
    public Estimate() {
    }

    public Estimate(String estimate_name,
                    String estimate_year,
                    Integer costumer_id_costumer,
                    Integer image_id_image) {
        this.estimate_name = estimate_name;
        this.estimate_year = estimate_year;
        this.costumer_id_costumer = costumer_id_costumer;
        this.image_id_image = image_id_image;
    }



    /**
     * ATTRIBUTS
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guitarestimation_id")
    private Integer estimate_id;

    @Column(name = "guitarestimation_name")
    private String estimate_name;

    @Column(name = "guitarestimation_year")
    private String estimate_year;

    @Column(name = "costumer_id_costumer")
    private Integer costumer_id_costumer;

    @Column(name = "image_id_image")
    private Integer image_id_image;

    /**
     * GETTERS AND SETTERS
     */

    public Integer getEstimate_id() {
        return estimate_id;
    }

    public void setEstimate_id(Integer estimate_id) {
        this.estimate_id = estimate_id;
    }

    public String getEstimate_name() {
        return estimate_name;
    }

    public void setEstimate_name(String estimate_name) {
        this.estimate_name = estimate_name;
    }

    public String getEstimate_year() {
        return estimate_year;
    }

    public void setEstimate_year(String estimate_year) {
        this.estimate_year = estimate_year;
    }

    public Integer getCostumer_id_costumer() {
        return costumer_id_costumer;
    }

    public void setCostumer_id_costumer(Integer costumer_id_costumer) {
        this.costumer_id_costumer = costumer_id_costumer;
    }

    public Integer getImage_id_image() {
        return image_id_image;
    }

    public void setImage_id_image(Integer image_id_image) {
        this.image_id_image = image_id_image;
    }

    /**
     * TOSTRING
     */

    @Override
    public String toString() {
        return "Estimate{" +
                "estimate_id=" + estimate_id +
                ", estimate_name='" + estimate_name + '\'' +
                ", estimate_year='" + estimate_year + '\'' +
                ", costumer_id_costumer=" + costumer_id_costumer +
                ", image_id_image=" + image_id_image +
                '}';
    }
}
