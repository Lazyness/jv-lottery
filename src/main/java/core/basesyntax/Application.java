package core.basesyntax;

import core.basesyntax.util.Info;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            Info.print(lottery.getRandomBall());
        }
    }
}
