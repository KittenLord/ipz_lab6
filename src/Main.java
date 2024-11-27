package work6;

import java.lang.Math;

/**
 * The Main class that contains the main entry method
 */
public class Main {

    /**
     * The entry method
     * @param args Program arguments
     */
    public static void main(String[] args) {
        ICoordinateSpace carts = new CartesianSpace(1, 1);
        ICoordinateSpace polar = new PolarSpace(1, 1);

        MathematicalFunction f1 = new MathematicalFunction(
            x -> x,
            carts
        );

        MathematicalFunction f2 = new MathematicalFunction(
            x -> Math.sin(x),
            polar
        );

        MathematicalFunction f3 = new MathematicalFunction(
            x -> x*x*x,
            carts
        );

        MathematicalFunction f4 = new MathematicalFunction(
            x -> x,
            polar
        );

        MathematicalFunction f5 = new MathematicalFunction(
            x -> Math.tan(x),
            carts
        );

        f1.display();
        f2.display();
        f3.display();
        f4.display();
        f5.display();
    }
}
