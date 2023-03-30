import java.util.Scanner; 

public class MatrixMultiplication 
{ 
	// function to multiply two matrices 
	static void multiply(int n, int m, int p, 
						int[][] firstMatrix, 
						int[][] secondMatrix, 
						int[][] multipliedMatrix) 
	{ 
		// Calculating time complexity
		long startTime = System.nanoTime();
		
		// multiplying each element of firstMatrix 
		// with each element of secondMatrix 
		for (int i = 0; i < n; i++) 
		{ 
			for (int j = 0; j < p; j++) 
			{ 
				for (int k = 0; k < m; k++) 
				{ 
					multipliedMatrix[i][j] += firstMatrix[i][k] 
											* secondMatrix[k][j]; 
				} 
			} 
		}
		
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		
		// Calculating space complexity
		long spaceComplexity = (n * m * 4) + (m * p * 4) + (n * p * 4);
		
		// Printing time and space complexity
		System.out.println("Time Complexity: " + timeElapsed + " nanoseconds");
		System.out.println("Space Complexity: " + spaceComplexity + " bytes");
	} 

	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions of the first matrix: "); 
		// Taking input for the size of the first matrix
		int n = sc.nextInt(); 
		int m = sc.nextInt();

		System.out.println("Enter the elements of the first matrix: ");
		// Creating first matrix
		int firstMatrix[][] = new int[n][m]; 

		// Taking input for the elements of first matrix
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				firstMatrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the dimensions of the second matrix: "); 
		// Taking input for the size of the second matrix
		int p = sc.nextInt(); 

		System.out.println("Enter the elements of the second matrix: ");
		// Creating second matrix
		int secondMatrix[][] = new int[m][p]; 

		// Taking input for the elements of second matrix
		for(int i = 0; i < m; i++){
			for(int j = 0; j < p; j++){
				secondMatrix[i][j] = sc.nextInt();
			}
		}
		
		// Creating multiplied matrix
		int multipliedMatrix[][] = new int[n][p];
		
		// Calling Function to multiply two matrices
		multiply(n, m, p, firstMatrix, 
							secondMatrix, multipliedMatrix); 
		
		System.out.println("Multiplied matrix: "); 
		
		// Displaying the result 
		for (int i = 0; i < n; i++) 
		{ 
			for (int j = 0; j < p; j++) 
				System.out.print(multipliedMatrix[i][j] + " "); 
			
			System.out.println(); 
		} 
	} 
}