//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package shapes;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    public Square(double side, String color, boolean filled) {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    public String toString() {
        double var10000 = this.getSide();
        return "Square with side: " + var10000 + " have Area: " + this.getArea() + " and Perimeter: " + this.getPerimeter() + " is Filled(?): " + this.isFilled() + ", and have color " + this.getColor();
    }
}
