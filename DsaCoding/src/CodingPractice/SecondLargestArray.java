package CodingPractice;

public class SecondLargestArray {

	public static void main(String[] args) {
		int[] arr = {2,5,1,9,3};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i]<largest && arr[i]>secondLargest){
				secondLargest = arr[i];
			}
		}
		
		System.out.println("Largest:  "+largest+"  SecondLargest:  "+secondLargest);
	}
}
