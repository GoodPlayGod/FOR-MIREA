package com.company;

public class Ball {
    private String collor;
    private int diameter;
    public Ball(String n, int a){
        collor = n;
        diameter = a;
    }
    public Ball(String n){
        collor = n;
        diameter = 0;
    }
    public Ball(){
        collor = "Pup";
        diameter = 0;
    }
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public void setCollor(String collor) {
        this.collor = collor;
    }
    public String getCollor(String collor){
        return collor;
    }
    public int getDiameter() {
        return diameter;
    }
    public String toString(){
        return this.collor+", diameter "+this.diameter;
    }
}

