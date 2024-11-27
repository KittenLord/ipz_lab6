package work6;

import java.lang.Math;

/**
 * The coordinate space that is polar
 */
public class PolarSpace implements ICoordinateSpace {

    /**
     * Multiplier for the radius
     */
    private double rScale;

    /**
     * The number of periods to loop over
     */
    private int periods;

    /**
     * The constructor for the polar coordinate space
     * @param rScale The radius multiplier
     * @param periods The amount of periods to iterate over
     */ 
    public PolarSpace(double rScale, int periods) {
        this.rScale = rScale;
        this.periods = periods;
    }

    /**
     * The method to draw the function in polar coordinate space
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

        for(double phi = 0.0; phi <= 2 * Math.PI * periods; phi += 0.1f) {
            double r = f.getValue(phi) * rScale;

            int x = (int)(width/2 + (r * Math.cos(phi)));
            int y = (int)(height/2 - (r * Math.sin(phi)));
            if(x < 0 || x >= width || y < 0 || y >= height) continue;

            grid[x][y] = '#';
        }

        for(int x = 0; x < width; x++) {
            if(grid[x][height / 2] == ' ') grid[x][height / 2] = '-';
        }

        for(int y = 0; y < height; y++) {
            if(grid[width / 2][y] == ' ') grid[width / 2][y] = '|';
        }

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                System.out.print(grid[x][y]);
            }
            System.out.print("\n");
        }
    }
    
}
