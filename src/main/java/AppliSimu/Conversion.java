package AppliSimu;

/**
 * Created by Matteo on 17/03/2016.
 * Convertie métres en pixels.
 */
public class Conversion {

    private static final double parametreConversionMetresPixels = 0.5;

    public static int calculerPositionPixels(int x) {
        return (int) (parametreConversionMetresPixels * x);
    }

}
