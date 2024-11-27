package work6;

import java.util.function.Function;

public class MathematicalFunction {
    private Function<Double, Double> function;
    private ICoordinateSpace coordinateSpace;
    
    public double getValue(double x) {
        return function.apply(x);
    }

    public void display() {
        coordinateSpace.drawFunction(this);
    }

    public MathematicalFunction(Function<Double, Double> function, ICoordinateSpace cs) {
        this.function = function;
        this.coordinateSpace = cs;
    }
}
