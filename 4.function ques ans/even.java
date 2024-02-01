import java.util.*;
public class even {
    
   public static boolean iseven(int a){
    if(a%2==0){
        return true;
    }
    else{
        return false;
    }

   }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int a=sc.nextInt();
        if(iseven(a)){
            System.out.println("No is Even");
        }
        else{
            System.out.println("No is odd");
        }


    }
}
