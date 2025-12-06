import java.util.*;

public class ArraysDemo{
   public static void main(String[] args){
   
      int[] array = new int[5];
      
         display("Original Array:           ", array);
         
         Arrays.fill(array,8);
         display("After filling with 8s:    ", array);

        array[0] = 8;
        array[1] = 8;
        array[2] = 6;
        array[3] = 8;
        array[4] = 3;
        
        display("After changing two values:", array);

        Arrays.sort(array);
        display("After sorting:            ", array);
    }

       public static void display(String message, int array[]) {
           System.out.print(message + "   ");
           for (int value : array) {
               System.out.print(value + " ");
           }
           System.out.println();
         
   
   }
}