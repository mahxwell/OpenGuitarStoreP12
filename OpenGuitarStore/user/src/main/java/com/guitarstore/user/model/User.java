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

    public User(String name,
                String surname,
                String pseudo,
                String mail,
                String password,
                boolean newsletter) {
        this.name = name;
        this.surname = surname;
        this.pseudo = pseudo;
        this.mail = mail;
        this.password = password;
        this.newsletter = newsletter;
    }

    /**
     * ATTRIBUTS
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "costumer_id")
    private Integer id;

    @Column(name = "costumer_name")
    private String name;

    @Column(name = "costumer_surname")
    private String surname;

    @Column(name = "costumer_pseudo")
    private String pseudo;

    @Column(name = "costumer_mail")
    private String mail;

    @Column(name = "costumer_password")
    private String password;

    @Column(name = "costumer_newsletter")
    private boolean newsletter;

    /**
     * GETTERS AND SETTERS
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isNewsletter() {
        return newsletter;
    }

    public void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }

    /**
     * TOSTRING
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", newsletter=" + newsletter +
                '}';
    }
}
