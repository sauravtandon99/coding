package CodingPractice;

public class IsSortedArray {

	public static void main(String[] args) {
		int[] arr = {11,2,3,4,5};
		boolean isSorted = true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				System.out.println("Not Sorted array");
				return;
			}
		}
		if(isSorted) {
			System.out.println("Array is sorted");
		}
			else{
			System.out.println("Array is not sorted");
		}
	}
}

