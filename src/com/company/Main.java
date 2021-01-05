package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 4);
        rectangle1.printRectangle();

        RoundedRectangle roundedRectangle1 = new RoundedRectangle(3,4,3);
        roundedRectangle1.printRectangle();
    }
}
