package core.basesyntax;

public class Ball {
    private String colours;
    private int number;

    public void setColours(String colours) {
        this.colours = colours;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "colours=" + colours +
                ", number=" + number +
                '}';
    }
}
