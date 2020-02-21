package com.guitarstore.user.model;

import javax.persistence.*;

@Entity
@Table(name = "costumer")
public class User {

    /**
     * CONSTRUCTOR
     */
    public User() {
    }

    public User(Integer costumer_id, String costumer_name,
                String costumer_surname,
                String costumer_pseudo,
                String costumer_mail,
                String costumer_password) {
        this.costumer_id = costumer_id;
        this.costumer_name = costumer_name;
        this.costumer_surname = costumer_surname;
        this.costumer_pseudo = costumer_pseudo;
        this.costumer_mail = costumer_mail;
        this.costumer_password = costumer_password;
    }

    /**
     * ATTRIBUTS
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "costumer_id")
    private Integer costumer_id;

    @Column(name = "costumer_name")
    private String costumer_name;

    @Column(name = "costumer_surname")
    private String costumer_surname;

    @Column(name = "costumer_pseudo")
    private String costumer_pseudo;

    @Column(name = "costumer_mail")
    private String costumer_mail;

    @Column(name = "costumer_password")
    private String costumer_password;

    /**
     * GETTERS AND SETTERS
     */
    public Integer getCostumer_id() {
        return costumer_id;
    }

    public void setCostumer_id(Integer costumer_id) {
        this.costumer_id = costumer_id;
    }

    public String getCostumer_name() {
        return costumer_name;
    }

    public void setCostumer_name(String costumer_name) {
        this.costumer_name = costumer_name;
    }

    public String getCostumer_surname() {
        return costumer_surname;
    }

    public void setCostumer_surname(String costumer_surname) {
        this.costumer_surname = costumer_surname;
    }

    public String getCostumer_pseudo() {
        return costumer_pseudo;
    }

    public void setCostumer_pseudo(String costumer_pseudo) {
        this.costumer_pseudo = costumer_pseudo;
    }

    public String getCostumer_mail() {
        return costumer_mail;
    }

    public void setCostumer_mail(String costumer_mail) {
        this.costumer_mail = costumer_mail;
    }

    public String getCostumer_password() {
        return costumer_password;
    }

    public void setCostumer_password(String costumer_password) {
        this.costumer_password = costumer_password;
    }
    /**
     * TOSTRING
     */
    @Override
    public String toString() {
        return "User{" +
                "costumer_id=" + costumer_id +
                ", costumer_name='" + costumer_name + '\'' +
                ", costumer_surname='" + costumer_surname + '\'' +
                ", costumer_pseudo='" + costumer_pseudo + '\'' +
                ", costumer_mail='" + costumer_mail + '\'' +
                ", costumer_password='" + costumer_password + '\'' +
                '}';
    }
}
