//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package shapes;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2.0D * (this.length + this.width);
    }

    public String toString() {
        double var10000 = this.getWidth();
        return "Rectangle with width: " + var10000 + ", length: " + this.getLength() + " have Area: " + this.getArea() + " and Perimeter: " + this.getPerimeter() + " is Filled(?): " + this.isFilled() + ", and have color " + this.getColor();
    }
}
