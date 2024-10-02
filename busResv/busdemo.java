import java.util.ArrayList;
import java.util.Scanner;

class Bus {
    private int busNumber;
    private boolean isAvailable;
    private int seats;

    public Bus(int busNumber, boolean isAvailable, int seats) {
        this.busNumber = busNumber;
        this.isAvailable = isAvailable;
        this.seats = seats;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getSeats() {
        return seats;
    }

    public void displaybusinfo() {
        System.out.println("Bus Number: " + busNumber + ", Available: " + isAvailable + ", Seats: " + seats);
    }
}

class Booking {
    private int busNumber;

    public Booking(int busNumber) {
        this.busNumber = busNumber;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        for (Bus bus : buses) {
            if (bus.getBusNumber() == this.busNumber && bus.isAvailable()) {
                return true;
            }
        }
        return false;
    }
}

public class busdemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();
        buses.add(new Bus(1, true, 4));
        buses.add(new Bus(2, true, 35));
        buses.add(new Bus(3, false, 5));
        buses.add(new Bus(4, true, 12));

        Scanner scanner = new Scanner(System.in);
        int userOption = 1;

        for (Bus b : buses) {
            b.displaybusinfo();
        }

        while (userOption == 1) {
            System.out.println("Enter 1 to book and 2 to exit");
            userOption = scanner.nextInt();
            if (userOption == 1) {
                System.out.println("Enter the bus number you want to book:");
                int busNumber = scanner.nextInt();

                Booking booking = new Booking(busNumber);
                if (booking.isAvailable(bookings, buses)) {
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed.");

                    // Update the bus availability
                    for (Bus bus : buses) {
                        if (bus.getBusNumber() == busNumber) {
                            bus.setAvailable(false);
                        }
                    }
                } else {
                    System.out.println("Sorry, the bus is full. Try another bus or date.");
                }
            }
        }
    }
}
