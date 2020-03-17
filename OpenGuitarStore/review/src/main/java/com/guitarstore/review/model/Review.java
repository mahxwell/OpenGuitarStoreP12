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

    public Review(Date reviewdate,
                  String reviewcomment,
                  Integer reviewnote,
                  Integer guitaridguitar,
                  Integer costumeridcostumer) {
        this.reviewdate = reviewdate;
        this.reviewcomment = reviewcomment;
        this.reviewnote = reviewnote;
        this.guitaridguitar = guitaridguitar;
        this.costumeridcostumer = costumeridcostumer;
    }

    /**
     * ATTRIBUTS
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Integer reviewid;

    @Column(name = "review_date")
    private Date reviewdate;

    @Column(name = "review_comment")
    private String reviewcomment;

    @Column(name = "review_note")
    private Integer reviewnote;

    @Column(name = "guitar_id_guitar")
    private Integer guitaridguitar;

    @Column(name = "costumer_id_costumer")
    private Integer costumeridcostumer;

    /**
     * GETTERS AND SETTERS
     */


    public Integer getReviewid() {
        return reviewid;
    }

    public void setReviewid(Integer reviewid) {
        this.reviewid = reviewid;
    }

    public Date getReviewdate() {
        return reviewdate;
    }

    public void setReviewdate(Date reviewdate) {
        this.reviewdate = reviewdate;
    }

    public String getReviewcomment() {
        return reviewcomment;
    }

    public void setReviewcomment(String reviewcomment) {
        this.reviewcomment = reviewcomment;
    }

    public Integer getReviewnote() {
        return reviewnote;
    }

    public void setReviewnote(Integer reviewnote) {
        this.reviewnote = reviewnote;
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

    /**
     * TOSTRING
     */

    @Override
    public String toString() {
        return "Review{" +
                "reviewid=" + reviewid +
                ", reviewdate=" + reviewdate +
                ", reviewcomment='" + reviewcomment + '\'' +
                ", reviewnote=" + reviewnote +
                ", guitaridguitar=" + guitaridguitar +
                ", costumeridcostumer=" + costumeridcostumer +
                '}';
    }
}
