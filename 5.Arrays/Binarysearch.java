// binary search program through java.. 
// binary search always works on shorted array

import java.util.*;
public class Binarysearch {

    public static int binary(int arr[], int key) {
        int start = 0 , end = arr.length - 1 ;
        while(start <= end){

            int mid = (start + end)/2;


            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elment in array arrays : ");
        int n = sc.nextInt();

        System.out.println("Enter the arrays list : ");
        int arr[] = new int[n];


        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the key in array :");
        int key = sc.nextInt();

        int found = binary(arr, key);
        System.out.println("your key is at index :  "+found);
    }
}
