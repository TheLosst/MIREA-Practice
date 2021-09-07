package ru.mirea.The_Losst.Ball1;
import java.lang.*;

public class Ball {
    private String color;
    private int cost;
    private double radius;

    public Ball(String color, int cost, double radius) {
        this.color = color;
        this.cost = cost;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", cost=" + cost +
                ", radius=" + radius +
                '}';
    }
}
