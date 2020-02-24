package com.guitarstore.review.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "review")
public class Review {

    /**
     * CONSTRUCTOR
     */
    public Review() {
    }

    public Review(Date review_date,
                  String review_comment,
                  Integer review_note,
                  Integer guitar_id_guitar,
                  Integer costumer_id_costumer) {
        this.review_date = review_date;
        this.review_comment = review_comment;
        this.review_note = review_note;
        this.guitar_id_guitar = guitar_id_guitar;
        this.costumer_id_costumer = costumer_id_costumer;
    }

    /**
     * ATTRIBUTS
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Integer review_id;

    @Column(name = "review_date")
    private Date review_date;

    @Column(name = "review_comment")
    private String review_comment;

    @Column(name = "review_note")
    private Integer review_note;

    @Column(name = "guitar_id_guitar")
    private Integer guitar_id_guitar;

    @Column(name = "costumer_id_costumer")
    private Integer costumer_id_costumer;

    /**
     * GETTERS AND SETTERS
     */


    public Integer getReview_id() {
        return review_id;
    }

    public void setReview_id(Integer review_id) {
        this.review_id = review_id;
    }

    public Date getReview_date() {
        return review_date;
    }

    public void setReview_date(Date review_date) {
        this.review_date = review_date;
    }

    public String getReview_comment() {
        return review_comment;
    }

    public void setReview_comment(String review_comment) {
        this.review_comment = review_comment;
    }

    public Integer getReview_note() {
        return review_note;
    }

    public void setReview_note(Integer review_note) {
        this.review_note = review_note;
    }

    public Integer getGuitar_id_guitar() {
        return guitar_id_guitar;
    }

    public void setGuitar_id_guitar(Integer guitar_id_guitar) {
        this.guitar_id_guitar = guitar_id_guitar;
    }

    public Integer getCostumer_id_costumer() {
        return costumer_id_costumer;
    }

    public void setCostumer_id_costumer(Integer costumer_id_costumer) {
        this.costumer_id_costumer = costumer_id_costumer;
    }

    /**
     * TOSTRING
     */

    @Override
    public String toString() {
        return "Review{" +
                "review_id=" + review_id +
                ", review_date=" + review_date +
                ", review_comment='" + review_comment + '\'' +
                ", review_note=" + review_note +
                ", guitar_id_guitar=" + guitar_id_guitar +
                ", costumer_id_costumer=" + costumer_id_costumer +
                '}';
    }
}
