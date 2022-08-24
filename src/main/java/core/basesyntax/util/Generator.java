package core.basesyntax.util;

import java.util.Random;

public class Generator {
    public static int generateRandomize(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}
