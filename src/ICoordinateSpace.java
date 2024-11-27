package work6;

/**
 * Interface that describes a coordinate space to which a function can be drawn
 */
public interface ICoordinateSpace {

    /**
     * A method to draw the function
     * @param f The function to be drawn
     */
    public void drawFunction(MathematicalFunction f);
}
