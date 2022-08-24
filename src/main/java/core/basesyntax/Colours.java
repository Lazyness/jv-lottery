package core.basesyntax;

public enum Colours {
    WHILE("while"),
    BLACK("black"),
    GREY("grey"),
    GREEN("green"),
    BLUE("blue"),
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    PINK("pink"),
    GOLD("gold");

    private final String environmentColor;

    Colours(String environmentColor) {
        this.environmentColor = environmentColor;
    }

    public String getEnvironmentColor() {
        return environmentColor;
    }
}
