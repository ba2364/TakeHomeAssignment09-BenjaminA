package com.ba2364.takehomeassignment09_benjamina;

import java.io.Serializable;

public class Cheese implements Serializable {
    private String name;
    private String place;
    private int amount;
    private boolean smelly;

    public Cheese() {
    } //Empty constructor required for data read from Firebase

    public Cheese(String name, String place, int amount, boolean smelly) {
        this.name = name;
        this.place = place;
        this.amount = amount;
        this.smelly = smelly;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public int getAmount() {
        return amount;
    }

    public boolean getSmelly() {
        return smelly;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setSmelly(boolean smelly) {
        this.smelly = smelly;
    }

    @Override
    public String toString() {
        return name + " " + place + " " + amount + " " + smelly;
    }
}