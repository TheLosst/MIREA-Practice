package ru.mirea.The_Losst.pr3.Shape;

public class Rectangle extends Shape_Abstract {

    double wight = 0.0;
    double length = 0.0;

    public Rectangle() {
    }

    public Rectangle(double wight, double length) {
        this.wight = wight;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double wight, double length) {
        super(color, filled);
        this.wight = wight;
        this.length = length;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "wight=" + wight +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
