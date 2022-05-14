package com.example.cakedescriptionapp;

public class Cake {
    int cakeImage;
    String cakeTittle, cakeDescription;

    public Cake(int cakeImage, String cakeTittle, String cakeDescription) {
        this.cakeImage = cakeImage;
        this.cakeTittle = cakeTittle;
        this.cakeDescription = cakeDescription;
    }

    public int getCakeImage() {
        return cakeImage;
    }

    public void setCakeImage(int cakeImage) {
        this.cakeImage = cakeImage;
    }

    public String getCakeTittle() {
        return cakeTittle;
    }

    public void setCakeTittle(String cakeTittle) {
        this.cakeTittle = cakeTittle;
    }

    public String getCakeDescription() {
        return cakeDescription;
    }

    public void setCakeDescription(String cakeDescription) {
        this.cakeDescription = cakeDescription;
    }
}
