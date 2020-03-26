package com.guitarstore.review.model;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class Review {

    /**
     * CONSTRUCTOR
     */
    public Review() {
    }

    public Review(String reviewdate,
                  String reviewcomment,
                  Integer reviewnote,
                  String reviewcostumername,
                  Integer guitaridguitar,
                  Integer costumeridcostumer) {
        this.reviewdate = reviewdate;
        this.reviewcomment = reviewcomment;
        this.reviewnote = reviewnote;
        this.reviewcostumername = reviewcostumername;
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
    private String reviewdate;

    @Column(name = "review_comment")
    private String reviewcomment;

    @Column(name = "review_note")
    private Integer reviewnote;

    @Column(name = "review_costumer_name")
    private String reviewcostumername;

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

    public String getReviewdate() {
        return reviewdate;
    }

    public void setReviewdate(String reviewdate) {
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

    public String getReviewcostumername() {
        return reviewcostumername;
    }

    public void setReviewcostumername(String reviewcostumername) {
        this.reviewcostumername = reviewcostumername;
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
                ", reviewdate='" + reviewdate + '\'' +
                ", reviewcomment='" + reviewcomment + '\'' +
                ", reviewnote=" + reviewnote +
                ", reviewcostumername='" + reviewcostumername + '\'' +
                ", guitaridguitar=" + guitaridguitar +
                ", costumeridcostumer=" + costumeridcostumer +
                '}';
    }
}
