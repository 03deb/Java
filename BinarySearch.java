import java.util.Scanner; 

public class BinarySearch 
{ 
	// Returns index of x if it is present in arr[l.. 
	// r], else return -1 
	static int binarySearch(int arr[], int l, int r, int x) 
	{ 
		if (r >= l) { 
			int mid = l + (r - l) / 2; 

			// If the element is present at the 
			// middle itself 
			if (arr[mid] == x) 
				return mid; 

			// If element is smaller than mid, then 
			// it can only be present in left subarray 
			if (arr[mid] > x) 
				return binarySearch(arr, l, mid - 1, x); 

			// Else the element can only be present 
			// in right subarray 
			return binarySearch(arr, mid + 1, r, x); 
		} 

		// We reach here when element is not present 
		// in array 
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
		
		int result = binarySearch(arr, 0, n - 1, x); 
		
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