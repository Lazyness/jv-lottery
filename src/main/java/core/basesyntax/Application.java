package core.basesyntax;

import core.basesyntax.util.Info;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Info.print(lottery.getRandomBall());
        Info.print(lottery.getRandomBall());
        Info.print(lottery.getRandomBall());
    }
}
