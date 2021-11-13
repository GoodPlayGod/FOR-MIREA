//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Interface;

public class MovableRectangle extends MovablePoint implements Movable {
    private MovablePoint upperLeft = new MovablePoint();
    private MovablePoint bottomRight = new MovablePoint();

    public MovableRectangle(int inputX1, int inputY1, int inputX2, int inputY2, int inputXSpeed, int inputYSpeed) {
        this.upperLeft.x = inputX1;
        this.upperLeft.y = inputY1;
        this.upperLeft.xSpeed = inputXSpeed;
        this.upperLeft.ySpeed = inputYSpeed;
        this.bottomRight.x = inputX2;
        this.bottomRight.y = inputY2;
        this.bottomRight.xSpeed = inputXSpeed;
        this.bottomRight.ySpeed = inputYSpeed;
    }

    public String toString() {
        return "Прямоугольник \n ----Первая " + this.upperLeft + "\n ----Вторая " + this.bottomRight;
    }

    public void moveUp() {
        this.upperLeft.moveUp();
        this.bottomRight.moveUp();
    }

    public void moveDown() {
        this.upperLeft.moveDown();
        this.bottomRight.moveDown();
    }

    public void moveLeft() {
        this.upperLeft.moveLeft();
        this.bottomRight.moveLeft();
    }

    public void moveRight() {
        this.upperLeft.moveRight();
        this.bottomRight.moveRight();
    }
}
