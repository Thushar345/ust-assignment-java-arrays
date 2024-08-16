package src;

public class secondLargest {

	public static void main(String[] args) {
		int arr[]= {2,1,3,4,5,6,7,8,9,3,4};
		int maxi=Integer.MIN_VALUE;
		int secondmaxi=Integer.MIN_VALUE;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>maxi) {
				maxi=arr[i];
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>secondmaxi && arr[i]!=maxi) {
				secondmaxi=arr[i];
			}
		}
		
		System.out.println("Second Largest element is "+ secondmaxi);

	}

}
