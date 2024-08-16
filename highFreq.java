package src;

public class highFreq {

	public static void main(String[] args) {
		int arr[]= {3,4,5,2,3,4,6,7,8,5,3,6,7,8,3};
		int maxi=Integer.MIN_VALUE;
        for (int num : arr) {
            if (num>maxi) {
                maxi=num;
            }
        }
        int[] count = new int[maxi+1];
        for (int num : arr) {
            count[num]++;
        }
        int maxFreq=0;
        int maxFreqElement = -1;
        for (int i=0; i<count.length; i++) {
            if (count[i]>maxFreq) {
                maxFreq=count[i];
                maxFreqElement=i;
            }
        }
        System.out.println("Highest frequency Element: " + maxFreqElement);


	}

}
