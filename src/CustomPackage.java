package com.harry.shape;

// Base class for Shapes
abstract class Shape {
    public abstract double surfaceArea();
    public abstract double volume();
}

// Rectangle Class
class Rectangle extends Shape {
    protected double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }
    public void setLength(double length) { this.length = length; }
    public void setWidth(double width) { this.width = width; }

    @Override
    public double surfaceArea() {
        return 2 * (length * width);
    }
    
    @Override
    public double volume() {
        return 0; // Rectangle is 2D
    }
}

// Square Class (inherits from Rectangle)
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
    public double getSide() { return length; }
    public void setSide(double side) {
        this.length = this.width = side;
    }
}

// Circle Class
class Circle extends Shape {
    protected double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    
    @Override
    public double surfaceArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double volume() {
        return 0; // Circle is 2D
    }
}

// Cylinder Class
class Cylinder extends Circle {
    private double height;
    
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    
    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    
    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Sphere Class
class Sphere extends Circle {
    public Sphere(double radius) {
        super(radius);
    }
    
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
    
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
