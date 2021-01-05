package com.company;

public class Rectangle {

    private final int width;
    private final int height;
    private int size;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, int size) {
        this.width = width;
        this.height = height;
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

   public double calculateArea() {
        return width * height; // esetleg kívülről:  return getWidth() * getHight()
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
    public void printRectangle() {
        System.out.println(toString());
    }
}


//Create empty rectangle class
//Add height and width private fields
//Add constructor(width, height)

//legyen egy size is a constructorban fielddel,
//private int
//lehet új constructor, vagy kibővíthető.
//getter legyen a highthoz és widthhez

//Implement calculateArea()

//Create a method in main called printRectangle() which prints it’s parameters
//toString és print?