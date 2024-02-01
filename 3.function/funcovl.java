// function overloading (see in details in opps class)
// multiple functions with same name but diffrent parameters
// diffentiating factors should be 
// 1. datatypes of parameters 
// 2. No. of parameters

public class funcovl{

// function to calculate sum of two no.
public static int sum(int a , int b){
   return  a+b;
     
}

// function to calculate sum of three no.
public static int sum(int a, int b,int c){
    return  a+b+c;
}



    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(3,4,5));
        
    }   
      
}
