package work6;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        ICoordinateSpace cs1 = new CartesianSpace(1, 0.001);
        ICoordinateSpace cs2 = new PolarSpace(1, 5);

        MathematicalFunction f = new MathematicalFunction(
            x -> x*x*x,
            cs1
        );

        MathematicalFunction fp = new MathematicalFunction(
            phi -> phi,
            cs2
        );

        f.display();
        fp.display();
    }
}
