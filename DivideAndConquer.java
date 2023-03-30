import java.util.Scanner; 

public class DivideAndConquer 
{ 
	// Function to find minimum and maximum element in an array 
	static void findMaxMin(int arr[], int low, int high, int minmax[]) 
	{ 
		int mid; 

		// When there is only one element 
		if (low == high) 
		{ 
			minmax[0] = arr[low]; 
			minmax[1] = arr[low]; 
			return; 
		} 

		// Calculating time complexity
		long startTime = System.nanoTime();
		
		// If there are two elements 
		if (high == low + 1) 
		{ 
			if (arr[low] > arr[high]) 
			{ 
				minmax[0] = arr[high]; 
				minmax[1] = arr[low]; 
			} 
			else
			{ 
				minmax[0] = arr[low]; 
				minmax[1] = arr[high]; 
			} 
			return; 
		} 
		
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		
		// Calculating space complexity
		long spaceComplexity = (2 * 4);
		
		// If there are more than 2 elements 
		mid = (low + high) / 2; 
		findMaxMin(arr, low, mid, minmax); 
		int minmax1[] = new int[2]; 
		findMaxMin(arr, mid + 1, high, minmax1); 

		if (minmax[0] < minmax1[0]) 
			minmax[0] = minmax[0]; 
		else
			minmax[0] = minmax1[0]; 

		if (minmax[1] > minmax1[1]) 
			minmax[1] = minmax[1]; 
		else
			minmax[1] = minmax1[1]; 

		// Printing time and space complexity
		System.out.println("Time Complexity: " + timeElapsed + " nanoseconds");
		System.out.println("Space Complexity: " + spaceComplexity + " bytes");
	} 

	public static void main(String args[]) 
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
		
		int minmax[] = new int[2]; 
		findMaxMin(arr, 0, n - 1, minmax); 

		System.out.println("Minimum element is: " + minmax[0]); 
		System.out.println("Maximum element is: " + minmax[1]); 
	} 
}