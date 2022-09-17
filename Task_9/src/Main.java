import model.Ball;
import model.Basket;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBalls(new Ball("blue", 34));
        basket.addBalls(new Ball("red", 45));
        basket.addBalls(new Ball("yellow", 67));
        basket.addBalls(new Ball("black", 14));
        System.out.println("Количество синих мячей " + basket.getCountBlue());
        System.out.println("Вес корзины " + basket.getWeight());
    }
}