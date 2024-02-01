// Program of Array for int datatype...

import java.util.*;
public class Arraycc {

    public static void update(int marks[],int nonchangable){
        nonchangable = 5;
        for(int i=0; i<marks.length ; i++){
            marks[i] = marks[i] + 1;
        }
    }
        
   
    public static void main(String[] args) {
        int marks[] = {90,91,92,93,94};
        int nonchangable = 10;
        update(marks ,nonchangable);
        
        System.out.println(nonchangable+" ");
       
        for(int i=0; i<marks.length ; i++){
            System.out.print(marks[i]+" ");
        }
       System.out.println();
    }
}
