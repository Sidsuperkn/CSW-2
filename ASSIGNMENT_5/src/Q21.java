import java.util.*;

public class Q21 {

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2 }, { 4, 5 } };
		int[][] matrix2 = { { 7, 8 }, { 10, 11 } };

		try {
			int[][] resultAddition = new int[matrix1.length][matrix1[0].length];
			for (int i = 0; i < matrix1.length; i++)
				for (int j = 0; j < matrix1[0].length; j++)
					resultAddition[i][j] = matrix1[i][j] + matrix2[i][j];

			for (int[] row : resultAddition)
				System.out.println(Arrays.toString(row));
			System.out.println();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Matrix index out of bounds - " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Error: Matrix dimensions mismatch - " + e.getMessage());
		}

		System.out.println("Matrix Multiplication:");
		try {
			int[][] resultMultiplication = new int[matrix1.length][matrix2[0].length];
			for (int i = 0; i < matrix1.length; i++)
				for (int j = 0; j < matrix2[0].length; j++)
					for (int k = 0; k < matrix1[0].length; k++)
						resultMultiplication[i][j] += matrix1[i][k] * matrix2[k][j];

			for (int[] row : resultMultiplication)
				System.out.println(Arrays.toString(row));
			System.out.println();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Matrix index out of bounds - " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Error: Matrix dimensions mismatch - " + e.getMessage());
		}

		System.out.println("Matrix Transpose:");
		try {
			int[][] resultTranspose = new int[matrix1[0].length][matrix1.length];
			for (int i = 0; i < matrix1.length; i++)
				for (int j = 0; j < matrix1[0].length; j++)
					resultTranspose[j][i] = matrix1[i][j];

			for (int[] row : resultTranspose)
				System.out.println(Arrays.toString(row));
			System.out.println();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Matrix index out of bounds - " + e.getMessage());
		}
	}

}
