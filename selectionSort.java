import java.util.Arrays; 
  
public class selectionSort { 
  
    public static void selection(int[] arr) { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n - 1; i++) { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i + 1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
  
    // Driver code to test above 
    public static void main(String args[]) { 
        int arr[] = {64, 25, 12, 22, 11}; 
  
        selection(arr); 
        System.out.println("Sorted array: " + Arrays.toString(arr)); 
        System.out.println("Time complexity of this approach is O(n^2)"); 
    } 
}