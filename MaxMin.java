import java.util.Scanner; 

public class MaxMin 
{ 
	static void findMaxMin(int arr[], int n) 
	{ 
		int max = arr[0]; 
		int min = arr[0]; 

		// Calculating time complexity
		long startTime = System.nanoTime();
		
		for (int i = 1; i < n; i++){ 
			if (arr[i] > max) 
				max = arr[i]; 
			if (arr[i] < min) 
				min = arr[i]; 
		} 
		
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		
		// Calculating space complexity
		long spaceComplexity = (n * 4) + (2 * 4);
		
		System.out.println("Maximum element is: "+ max); 
		System.out.println("Minimum element is: "+ min); 

		// Printing time and space complexity
		System.out.println("Time Complexity: " + timeElapsed + " nanoseconds");
		System.out.println("Space Complexity: " + spaceComplexity + " bytes");
	} 

	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: "); 
		// Taking input for the size of the array
		int n = sc.nextInt(); 

		// Creating array
		int arr[] = new int[n]; 
		System.out.println("Enter the elements of the array: ");

		// Taking input for the elements of array
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		
		findMaxMin(arr, n); 
	} 
}