// program for linear search...
import java.util.*;
public class Linearsearch {
   
    public static int linearsearch(int arr[], int key) {
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == key){
                return i;   
            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key,n;
        System.out.println("Enter the no of elements you want in array : ");
        n=sc.nextInt();
        int  arr[] = new int[n];   // this is for no. of array we want

        System.out.println("Enter the no of elements you want in array : ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();  // this is for the elements we want in array
        }

        System.out.println("Enter the Key to find : ");
        key = sc.nextInt();        // this is for finding the keys in array


        int index = linearsearch(arr, key);   // this is function call
        
        if(index == -1){
              System.out.println("the key is not found");
        }
        else{
            System.out.println("The key is at index : "+index);
        }
}
}