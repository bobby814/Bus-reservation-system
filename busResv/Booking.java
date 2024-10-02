package busResv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

// Booking class for bus reservation
public class Booking {

    String passengerName;
    int busNo;
    Date date;

    // Constructor for booking a ticket
    Booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER PASSENGER NAME:");
        passengerName = scanner.next();
        System.out.println("ENTER BUS NO:");
        busNo = scanner.nextInt();
        System.out.println("Enter date (dd-MM-yyyy):");
        String dateInput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use dd-MM-yyyy.");
            e.printStackTrace();
        }
    }

    // Method to check if seats are available for the selected bus
    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNumber() == busNo) {
                capacity = bus.getCapacity();
                break;
            }
        }

        int booked = 0;
        for (Booking b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
                booked++;
            }
        }

        return booked < capacity;
    }
}
