package array;

public class Number_3195 {


    public int minimumArea(int[][] grid) {

        int top = -1, bottom = -1, left = -1, right = -1;
        int rowSize = grid.length, columnSize = grid[0].length;

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (grid[i][j] == 1) {
                    top = i;
                    break;
                }
            }

            if (top != -1) {
                break;
            }
        }

        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                if (grid[j][i] == 1) {
                    left = i;
                    break;
                }
            }

            if (left != -1) {
                break;
            }
        }

        for (int i = rowSize - 1; i >= 0; i--) {
            for (int j = 0; j < columnSize; j++) {
                if (grid[i][j] == 1) {
                    bottom = i;
                    break;
                }
            }

            if (bottom != -1) {
                break;
            }
        }

        for (int i = columnSize - 1; i >= 0; i--) {
            for (int j = 0; j < rowSize; j++) {
                if (grid[j][i] == 1) {
                    right = i;
                    break;
                }
            }

            if (right != -1) {
                break;
            }
        }

        return (right - left + 1) * (bottom - top + 1);

    }

    public int minimumAreaMain(int[][] grid) {

        int minR = Integer.MAX_VALUE;
        int maxR = Integer.MIN_VALUE;
        int minC = Integer.MAX_VALUE;
        int maxC = Integer.MIN_VALUE;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    if (i < minR) minR = i;
                    if (i > maxR) maxR = i;
                    if (j < minC) minC = j;
                    if (j > maxC) maxC = j;
                }

            }
        }

        return (maxR - minR + 1) * (maxC - minC + 1);
    }
}



