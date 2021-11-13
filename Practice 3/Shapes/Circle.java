//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package shapes;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return 3.14D * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 6.28D * this.radius;
    }

    public String toString() {
        double var10000 = this.getRadius();
        return "Circle with " + var10000 + " radius have Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter() + " is Filled(?): " + this.isFilled() + ", and have color " + this.getColor();
    }
}
