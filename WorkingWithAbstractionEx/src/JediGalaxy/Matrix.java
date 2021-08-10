package JediGalaxy;

public class Matrix {
   private int[][] matrix;
   private long pointsOfIvo;

    public Matrix(int row, int col){
        this.matrix = new int[row][col];
        this.fillMatrix(row, col);
    }

    private void fillMatrix(int row, int col){
        int value = 0;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                matrix[i][j] = value++;
            }
        }
    }

    public void evilPower(int row, int col){
        while (row >= 0 && col >= 0)
        {
            if (row < this.matrix.length && col < this.matrix[0].length)
            {
                matrix[row] [col] = 0;
            }
            row--;
            col--;
        }
    }

    public void goodPower(int row, int col){
        while (row >= 0 && col < matrix[1].length)
        {
            if (row < matrix.length && col >= 0 && col < matrix[0].length)
            {
                this.pointsOfIvo += matrix[row][col];
            }

            row--;
            col++;
        }
    }

    public long getPointsOfIvo() {
        return pointsOfIvo;
    }
}
