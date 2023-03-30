import java.util.Scanner; 

public class LinearSearch 
{ 
	// This function returns index of element x in arr[] 
	static int search(int arr[], int n, int x) 
	{ 
		for (int i = 0; i < n; i++) 
		{ 
			// Return the index of the element if the element 
			// is found 
			if (arr[i] == x) 
				return i; 
		} 

		// return -1 if the element is not found 
		return -1; 
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
		// Taking input for the element to be searched
		System.out.println("Enter the element to be searched: ");
		int x = sc.nextInt();
		
		// Calculating time complexity
		long startTime = System.nanoTime();
		
		int result = search(arr, n, x); 
		
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		
		// Calculating space complexity
		long spaceComplexity = (n * 4) + (4 * 4);
		
		if (result == -1) 
			System.out.println("Element is not present in array"); 
		else
			System.out.println("Element is present at index " + result); 

		// Printing time and space complexity
		System.out.println("Time Complexity: " + timeElapsed + " nanoseconds");
		System.out.println("Space Complexity: " + spaceComplexity + " bytes");
	} 
}