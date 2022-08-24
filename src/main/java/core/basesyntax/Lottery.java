package core.basesyntax;

import core.basesyntax.util.Generator;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColours(colorSupplier.getRandomColor());
        ball.setNumber(Generator.generateRandomize(101));
        return ball;
    }
}
