package com.company;

public class Cylinder extends Circle{
    public double height ;


    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public Cylinder(){}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double Newcylineder(){
        return radius*radius*Math.PI*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}';
    }
}
