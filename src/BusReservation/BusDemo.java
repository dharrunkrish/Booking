package BusReservation;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
    public static void main(String[] args) {
        ArrayList <Bus> buses=new ArrayList<Bus>();
        ArrayList <Booking> bookings=new ArrayList<Booking>();

        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,30));
        buses.add(new Bus(3,true,32));
        int option =1;
        Scanner sc=new Scanner(System.in);
        for (Bus b : buses) {
            b.Businfo();
        }

        while (option==1) {
        System.out.println("Enter 1 to Book and 2 to Exit :");
        option = sc.nextInt();
        if (option==1) {
            Booking booking =new Booking();
            if(booking.isAvailable(bookings,buses)){
                bookings.add(booking);
                System.out.println("Your seat has Booked.");
            }
            else{
                System.out.println("Sorry bus is full. try Another bus or date. ");
            }
        }
        }
        
    }
   

}
