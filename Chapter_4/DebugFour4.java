// This class uses a DebugTrip class
// to instantiate three Trip objects
// Each uses a different version of the constructor
import java.util.Scanner;
public class DebugFour4
{
public static void main(String args[])
{
   Scanner input = new Scanner(System.in);
   String destinationCity;
   String departureCity;
   String mode;

      System.out.print("Enter destination city >> ");
         destinationCity = input.nextLine();
      System.out.print("Enter departure city >> ");
         departureCity = input.nextLine();
      System.out.print("Enter mode of transportation >> ");
         mode = input.nextLine();
          
        DebugTrip trip1 = new DebugTrip(destinationCity);
        DebugTrip trip2 = new DebugTrip(destinationCity, departureCity);
        DebugTrip trip3 = new DebugTrip(destinationCity, departureCity, mode);
        
        display(trip1);
        display(trip2);
        display(trip3);
   
   }
   public static void display(DebugTrip trip)
   {
      System.out.println(" Going to: " + trip.getDestination());
      System.out.println(" Leaving from: " + trip.getDeparture());
      System.out.println(" Going by: " + trip.getMode());
   }
}


class DebugTrip {
   private String destinationCity;
   private String departureCity;
   private String mode;
   
   private static final String DEFAULT_CITY = "Atlanta";
   private static final String DEFAULT_MODE = "car";

         public DebugTrip(String destinationCity) {
            this.destinationCity = destinationCity;
            this.departureCity = DEFAULT_CITY;
            this.mode = DEFAULT_MODE;
        }

        public DebugTrip(String destinationCity, String departureCity) {
            this.destinationCity = destinationCity;
            this.departureCity = departureCity;
            this.mode = DEFAULT_MODE;
        }

        public DebugTrip(String destinationCity, String departureCity, String mode) {
            this.destinationCity = destinationCity;
            this.departureCity = departureCity;
            this.mode = mode;
        }
    

    public String getDestination() {
        return destinationCity;
    }

    public String getDeparture() {
        return departureCity;
    }
    
    public String getMode() {
        return mode;
    }



}
