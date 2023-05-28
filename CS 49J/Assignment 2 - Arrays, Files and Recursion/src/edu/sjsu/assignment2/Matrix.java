package edu.sjsu.assignment2;

public class Matrix
{
    private int[][] matrix;

    public Matrix(int[][] array)
    {
        matrix = new int[array.length][];

        for( int i = 0; i < array.length; ++i )
            matrix[i] = array[i].clone();
    }

    public int[][] getMatrix()
    {
        int[][] matrix_copy = new int[matrix.length][];

        for(int i = 0; i < matrix.length; ++i)
            matrix_copy[i] = matrix[i].clone();

        return matrix_copy;
    }

    public Matrix multiply(Matrix m2)
    {
        int[][] m_matrix = m2.getMatrix();

        int m_rows = matrix.length;
        int m_columns = matrix[0].length;

        int mm_rows = m_matrix.length;
        int mm_columns = m_matrix[0].length;

        /// Checking if matrices are compatible
        if (m_columns != mm_rows)
            throw new ArithmeticException("Cannot multiply these matrices");

        /// Creating Empty Matrix
        int[][] result_matrix = new int[m_rows][mm_columns];
        /// Setting to zero
        for(int i = 0; i < m_rows; ++i)
            for(int j = 0; j < mm_columns; ++j)
                result_matrix[i][j] = 0;

        for(int i = 0; i < m_rows; ++i)
            for(int j = 0; j < mm_columns; ++j)
                for(int k = 0; k < m_columns; ++k)
                    result_matrix[i][j] += matrix[i][k] * m_matrix[k][j];

        return new Matrix(result_matrix);
    }

}
