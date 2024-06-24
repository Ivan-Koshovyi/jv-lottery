package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = new Random().nextInt(Ball.Color.values().length);
        return String.valueOf(Ball.Color.values()[index]);
    }
}
