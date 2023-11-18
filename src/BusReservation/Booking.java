package BusReservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
    String PassName;
    int busNo;
    Date Date;
    
    Booking(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        PassName=sc.nextLine();
        System.out.println("Enter BusNo: ");
        busNo=sc.nextInt();
        System.out.println("Enter Date dd-mm-yy: ");
        String Dateinput=sc.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date=dateFormat.parse(Dateinput);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity =0;
        for (Bus bus : buses) {
            if (bus.getBusNo()==busNo) {
                capacity=bus.getCapacity();
                capacity++;
            }
        }
        int booked=0;
        for (Booking b: bookings) {
                if (b.busNo==busNo && b.Date.equals(Date)) {
                    booked++;
                }
        }
            
 return booked<capacity?true:false;
    }
    
   
   
       
    
    }
    

