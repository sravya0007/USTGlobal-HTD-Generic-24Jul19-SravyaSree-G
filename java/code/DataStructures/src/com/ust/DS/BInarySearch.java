package com.ust.DS;

public class BInarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 12, 13, 41, 66, 87, 91 };
		int start = 0;
		int end = arr.length;
		System.out.println(arr[binarySearch(arr, start, end, 12)] + " found");
	}

	public static int binarySearch(int arr[], int start, int end, int i) {
		// TODO Auto-generated method stub
		int mid = start + (end - start) / 2;
		if (start <= end) {
			if (i == arr[mid])
				return mid;
			
			else if(arr[mid]<i)
				return binarySearch(arr,mid-1,end,i); 

			else
				return binarySearch(arr,start,mid+1,i); 

		}
		return -1;

	}

}
