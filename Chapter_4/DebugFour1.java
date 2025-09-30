// This class uses a DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;
public class DebugFour1
{
private static int radius;

public static void main(String args[])
{
Scanner input = new Scanner(System.in);

System.out.println("Enter a radius for a circle >> ");
radius = input.nextInt();

System.out.println("The radius is " + getRad());
System.out.println("The diameter is " + getDiam());
System.out.println("The area is " + getArea());
}

public static int getRad(){
return radius;
}

public static int getDiam(){
return radius * 2;
}

public static double getArea(){
return Math.PI * radius * radius;
}

}