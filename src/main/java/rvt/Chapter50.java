package rvt;
import java.util.Scanner;
class Exercise1 {

    private double width;
    private double height;
    private double length;

    public Exercise1(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Exercise1(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * (width * height + width * length + height * length);
    }
}


class Exercise2 {

    private double width;
    private double height;
    private double length;


    public Exercise2(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Exercise2(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }


    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }


    private double faceArea() {       
        return width * height;
    }

    private double topArea() {     
        return width * length;
    }

    private double sideArea() { 
        return height * length;
    }
}


class Exersice3 {

    private double width;
    private double height;
    private double length;

    public Exersice3(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Exersice3(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public Exersice3(Exersice3 oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }


    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }


    public double length() {
        return length;
    }

    public double height() {
        return height;
    }

    public double width() {
        return width;
    }


    private double faceArea() {
        return width * height;
    }

    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return height * length;
    }
}


class Exercise4 {

    private double width;
    private double height;
    private double length;

    public Exercise4(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Exercise4(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public Exercise4(Exercise4 oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }


    public double length() { return length; }
    public double height() { return height; }
    public double width() { return width; }


    private double faceArea() { return width * height; }
    private double topArea() { return width * length; }
    private double sideArea() { return height * length; }


    public Exercise4 biggerBox(Exercise4 oldBox) {
        return new Exercise4(
            1.25 * oldBox.width(),
            1.25 * oldBox.height(),
            1.25 * oldBox.length()
        );
    }

    public Exercise4 smallerBox(Exercise4 oldBox) {
        return new Exercise4(
            0.75 * oldBox.width(),
            0.75 * oldBox.height(),
            0.75 * oldBox.length()
        );
    }
}


class Exercise5 {

    private double width;
    private double height;
    private double length;


    public Exercise5(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Exercise5(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public Exercise5(Exercise5 oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }


    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }


    public double width() { return width; }
    public double height() { return height; }
    public double length() { return length; }


    private double faceArea() { return width * height; }
    private double topArea()  { return width * length; }
    private double sideArea() { return height * length; }


    public Exercise5 biggerBox(Exercise5 oldBox) {
        return new Exercise5(
            1.25 * oldBox.width(),
            1.25 * oldBox.height(),
            1.25 * oldBox.length()
        );
    }

    public Exercise5 smallerBox(Exercise5 oldBox) {
        return new Exercise5(
            0.75 * oldBox.width(),
            0.75 * oldBox.height(),
            0.75 * oldBox.length()
        );
    }

    public boolean nests(Exercise5 outsideBox) {
        return this.width < outsideBox.width &&
               this.height < outsideBox.height &&
               this.length < outsideBox.length;
    }
}
