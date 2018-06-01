package com.parkinglot;

public abstract class Party {
    private int id;

    public Party(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
