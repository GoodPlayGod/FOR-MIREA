//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Interface;

public class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center = new MovablePoint();

    public MovableCircle(int inputX, int inputY, int inputXSpeed, int inputYSpeed, int radius) {
        this.center.x = inputX;
        this.center.y = inputY;
        this.center.xSpeed = inputXSpeed;
        this.center.ySpeed = inputYSpeed;
        this.radius = radius;
    }

    public String toString() {
        return "Центр окружности " + this.center + "\nРадиус окружности: " + this.radius;
    }
}
