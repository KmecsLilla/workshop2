package com.company;

import static java.lang.Math.PI;

public class RoundedRectangle extends Rectangle {
    private int radius;

    public RoundedRectangle(int width, int height, int radius) {
        super(width, height);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        //return super.calculateArea() - 4 * (radius * radius)) + (radius * radius * PI);
        return (getWidth() * getHeight()) - (4 * (radius * radius)) + (radius * radius * PI);
    }

    @Override
    public String toString() {
        return "RoundedRectangle{" + "width=" + getWidth() + ", height=" + getHeight() + ",  radius=" + radius + '}';
    }

    public void printRoundedRectangle() {
        System.out.println(toString());
    }

}


//Imola Lajos9:42
//feladat:
//új class, üresen. Neve: Rounded Rectangle
//kiterjeszti a Rectanglet.
//Bendegúz Hajdú9:42
//Create empty RoundedRectangle which inherits Rectangle

//Create private field round radius
//Create getter for radius

//
//)Zoltán Vécsey9:55
//téglalap területe - átmérő négyzetének harmaga
//harmada
//Bendegúz Hajdú9:55
//Override calculateArea method
//Math.PI

//public RoundedRectangle(int width, int height, int roundRadius) {
//        super(width, height);
//        this.ROUND_RADIUS = roundRadius;
//    }