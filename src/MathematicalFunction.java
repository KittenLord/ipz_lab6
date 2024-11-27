package work6;

import java.util.function.Function;

/**
 * A class that describes a displayable mathematical function
 */
public class MathematicalFunction {

    /**
     * The underlying function
     */
    private Function<Double, Double> function;

    /**
     * The coordinate space to which the function belongs
     */
    private ICoordinateSpace coordinateSpace;
    
    /**
     * A method to get the output of the function
     * @param x The argument
     */
    public double getValue(double x) {
        return function.apply(x);
    }

    /**
     * A method to display the function using the coordinate space
     */
    public void display() {
        coordinateSpace.drawFunction(this);
    }

    /**
     * The constructor for the mathematical function
     * @param function The underlying mathematical function
     * @param cs The coordinate space to be used
     */
    public MathematicalFunction(Function<Double, Double> function, ICoordinateSpace cs) {
        this.function = function;
        this.coordinateSpace = cs;
    }
}
