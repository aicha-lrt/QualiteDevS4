package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture {

    int id;
    String marque;
    double prix;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }



}
