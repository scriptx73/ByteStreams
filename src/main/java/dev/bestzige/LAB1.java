package dev.bestzige;

public class LAB1 {
    public static void main(String[] args) {
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        redCircle.draw();
        redRectangle.draw();
    }
}
