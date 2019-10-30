package chapter9;

public class Rectangle {

    protected double length;
    protected double width;
    protected double sides;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double calculatePerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public void print() {
        System.out.println("I'm a rectangle");
    }
}
