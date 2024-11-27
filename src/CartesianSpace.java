package work6;

/**
 * A coordinate space that is cartesian
 */
public class CartesianSpace implements ICoordinateSpace {

    /**
     * The multiplier for displayed x coordinate
     */
    private double xScale;

    /**
     * The multiplier for displayed y coordinate
     */
    private double yScale;

    /**
     * The constructor for the cartesian coordinate space
     * @param xScale The x multiplier
     * @param yScale The y multiplier
     */
    public CartesianSpace(double xScale, double yScale) {
        this.xScale = xScale;
        this.yScale = yScale;
    }

    /**
     * A method to draw the function in the cartesian space
     * @param f The specified function
     */
    public void drawFunction(MathematicalFunction f) {
        int width = 60;
        int height = 40;

        char[][] grid = new char[width][];
        for(int i = 0; i < width; i++) { grid[i] = new char[height]; }
        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height; y++) {
                grid[x][y] = ' ';
            }
        }

        int xOffset = -width / 2;
        int yOffset = height / 2;
        for(int i = 0; i < width; i++) {
            double x = xScale * (i + xOffset);
            double y = yScale * f.getValue(x);

            int yy = (int)(-y + yOffset);
            if(yy >= 0 && yy < height) {
                grid[i][yy] = '#';
            }
        }

        for(int x = 0; x < width; x++) {
            if(grid[x][yOffset] == ' ') grid[x][yOffset] = '-';
        }

        for(int y = 0; y < height; y++) {
            if(grid[-xOffset][y] == ' ') grid[-xOffset][y] = '|';
        }

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                System.out.print(grid[x][y]);
            }
            System.out.print("\n");
        }
    }

}
