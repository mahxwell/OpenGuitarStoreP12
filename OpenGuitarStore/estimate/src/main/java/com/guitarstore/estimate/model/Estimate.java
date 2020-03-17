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

    public Estimate(String estimatename,
                    String estimateyear,
                    Integer costumeridcostumer,
                    Integer imageidimage) {
        this.estimatename = estimatename;
        this.estimateyear = estimateyear;
        this.costumeridcostumer = costumeridcostumer;
        this.imageidimage = imageidimage;
    }

    /**
     * ATTRIBUTS
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guitarestimation_id")
    private Integer estimateid;

    @Column(name = "guitarestimation_name")
    private String estimatename;

    @Column(name = "guitarestimation_year")
    private String estimateyear;

    @Column(name = "costumer_id_costumer")
    private Integer costumeridcostumer;

    @Column(name = "image_id_image")
    private Integer imageidimage;

    /**
     * GETTERS AND SETTERS
     */

    public Integer getEstimateid() {
        return estimateid;
    }

    public void setEstimateid(Integer estimateid) {
        this.estimateid = estimateid;
    }

    public String getEstimatename() {
        return estimatename;
    }

    public void setEstimatename(String estimatename) {
        this.estimatename = estimatename;
    }

    public String getEstimateyear() {
        return estimateyear;
    }

    public void setEstimateyear(String estimateyear) {
        this.estimateyear = estimateyear;
    }

    public Integer getCostumeridcostumer() {
        return costumeridcostumer;
    }

    public void setCostumeridcostumer(Integer costumeridcostumer) {
        this.costumeridcostumer = costumeridcostumer;
    }

    public Integer getImageidimage() {
        return imageidimage;
    }

    public void setImageidimage(Integer imageidimage) {
        this.imageidimage = imageidimage;
    }

    /**
     * TOSTRING
     */

    @Override
    public String toString() {
        return "Estimate{" +
                "estimateid=" + estimateid +
                ", estimatename='" + estimatename + '\'' +
                ", estimateyear='" + estimateyear + '\'' +
                ", costumeridcostumer=" + costumeridcostumer +
                ", imageidimage=" + imageidimage +
                '}';
    }
}
