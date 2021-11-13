//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package shapes;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    protected Integer radius;

    Shape() {
    }

    Shape(Integer rad, String col, boolean fil) {
        this.color = col;
        this.filled = fil;
        this.radius = rad;

    }

    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}
