package work6;

public class CartesianSpace implements ICoordinateSpace {

    private double xScale;
    private double yScale;

    public CartesianSpace(double xScale, double yScale) {
        this.xScale = xScale;
        this.yScale = yScale;
    }

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
