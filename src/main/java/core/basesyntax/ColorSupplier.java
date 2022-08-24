package core.basesyntax;

import core.basesyntax.util.Generator;

public class ColorSupplier {
    public String getRandomColor() {
        Colours[] colours = Colours.values();
        return colours[Generator.generateRandomize(colours.length)].getEnvironmentColor();
    }
}
