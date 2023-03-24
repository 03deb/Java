import java.io.*;
import java.util.*;
import java.lang.*;

public class Permutation{
	
	static void permu(int arr[], int n){
		int idx=0;
		for(int i=n-1; i>0; i--){
			if(arr[n-1] > arr[i-1]){
				idx = i;
				int temp = arr[i-1];
				arr[i-1] = arr[n-1];
				arr[n-1] = temp;
				break;
			}
		}
		//int idx=3;
		java.util.Arrays.sort(arr,idx,n);
		System.out.println(idx);
		System.out.print(java.util.Arrays.toString(arr));
		
	}

	public static void main(String[] args){
		int[] arr = {1,2,3,6,5,4};
		int n=6;
		permu(arr,n);
	}
}