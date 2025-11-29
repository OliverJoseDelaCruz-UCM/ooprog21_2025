import java.util.*;

public class StringBuilderDemo{
   public static void main(String[] args){

   StringBuilder namestring = new StringBuilder(23);
   namestring.append("barbara");
   System.out.println("(StringBuilder 1) nameString: " + namestring);
   System.out.println("Capacity of nameString is: " + namestring.capacity());
   
   StringBuilder addresstring = new StringBuilder(43);
   addresstring.append("6311 Hickory Nut Grove Road");
   System.out.println("(StringBuilder 2) AddressString: " + addresstring);
   System.out.println("Capacity of addressString is: " + addresstring.capacity());
   
   
   namestring.setLength(20);
   addresstring.setLength(20);
   
   System.out.println("(length set to 20 for StringBuilder 1) The name is " + namestring + "end");
   System.out.println("(Length set to 20 for StringBuilder 2) The address is " + addresstring);
   }
}