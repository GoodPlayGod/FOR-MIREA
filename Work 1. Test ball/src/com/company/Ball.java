package com.company;

public class Ball {
    private String color;
    private int diameter;
    public Ball(String n, int a){
        color = n;
        diameter = a;
    }
    public Ball(String n){
        color = n;
        diameter = 0;
    }
    public Ball(){
        color = "colorless";
        diameter = 0;
    }
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public int getDiameter() {
        return diameter;
    }
    public String toString(){
        return this.color+", diameter "+this.diameter;
    }
}

