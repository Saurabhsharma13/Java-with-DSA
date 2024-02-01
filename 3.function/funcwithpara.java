// Function with parameters 
// There are of two types of functions 

// 1. Formal parameter     2. Actual parameter  also 
//   function defination      function call




import java.util.*;
public class funcwithpara {

public static int Calculatesum(int a,int b){ //formal parameter / defination
    int sum = a+b;                       
    return sum;            
    

}

public static int Calculatesub(int a,int b){
    int sub = a-b;
    return sub;

}

public static int multiply(int a,int b){
    int product = a*b;
    return product;

}

public static void swap(int a, int b){
    int temp =  a;
    a = b;
    b = temp;
    System.out.println("a = " +a);
    System.out.println("b = " +b);

}



    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=Calculatesum(a,b);  // function call actual parameter
        int sub=Calculatesub(a,b);
        swap(a, b);
        int x=multiply(8,9); 
        System.out.println(x);

        System.out.println(sum);
        System.out.println(sub);
        
}
    }


