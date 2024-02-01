import java.util.Arrays;

public class Largeno {

    public static int findLargestNo(int[] arr) {

        int max = Integer.MIN_VALUE; // its for -infinity
        int min = Integer.MAX_VALUE; // its for +infinity

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min){
                min=arr[i];
            }
        }
        System.out.println("Smallest value is "+min);  // we can return only one value at a time thats why we written in the function
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 2, 89, 300, 245, 3};
        System.out.println("Largest number in the array: " + findLargestNo(arr));
    }


}