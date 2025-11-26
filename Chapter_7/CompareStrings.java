import java.util.*;

public class CompareStrings {

public static void main(String[] args){
String pangan = "Carmen";
Scanner input = new Scanner(System.in);

   while(true){
   System.out.print("Enter your name < ");
   String name = input.nextLine();
   
   if(pangan.equals(name)){
   System.out.println("Carmen equals " + name);
   }else{
   System.out.println("Carmen does not equal " + name);
   }
   break;
   }

}
}

