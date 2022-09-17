package model;

import java.util.ArrayList;
import java.util.Objects;

public class Basket {
    private ArrayList<Ball> balls = new ArrayList<Ball>();

    public Basket() {
    }

    public Basket(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public void addBalls(Ball ball) {
        balls.add(ball);
    }

    public int getWeight() {
        int weight = 0;
        for (Ball ball : balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getCountBlue() {
        int counter = 0;
        for (Ball ball : balls) {
            if (Objects.equals(ball.getColor(), "blue"))
                counter++;
        }
        return counter;
    }
}
