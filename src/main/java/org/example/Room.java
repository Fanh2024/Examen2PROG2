package org.example;

public class Room {
    private int number;
    private double pricePerNight;

    public Room(int number, double pricePerNight) {
        this.number = number;
        this.pricePerNight = pricePerNight;
    }

    public int getNumber() {
        return number;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

}
