// date - 18/01/2024

public class funcovl{
    static void printArray(int[] array) {
       for (int element : array) {
         System.out.print(element + " ");
       }
       System.out.println();
    }
   
    static void printArray(double[] array) {
       for (double element : array) {
         System.out.print(element + " ");
       }
       System.out.println();
    }
   
    static void printArray(boolean[] array) {
       for (boolean element : array) {
         System.out.print(element + " ");
       }
       System.out.println();
    }
   
    static void printArray(char[] array) {
       for (char element : array) {
         System.out.print(element + " ");
       }
       System.out.println();
    }
   
    public static void main(String[] args) {
       int[] intArray = {1, 2, 3, 4, 5};
       double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
       boolean[] booleanArray = {true, false, true, false, true};
       char[] charArray = {'H', 'e', 'l', 'l', 'o'};
   
       printArray(intArray);
       printArray(doubleArray);
       printArray(booleanArray);
       printArray(charArray);
    }
   }
