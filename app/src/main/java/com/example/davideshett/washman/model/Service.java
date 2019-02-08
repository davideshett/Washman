package com.example.davideshett.washman.model;

public class Service {

    private String name;
    private int thumbnail;
    private double price;

    public Service() {
    }
    public Service(String name, int thumbnail, double price) {
        this.name = name;
        this.thumbnail = thumbnail;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
