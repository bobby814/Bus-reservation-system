package busResv;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    // Constructor
    public Bus(int no, boolean ac, int cap) {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    // Getters and Setters
    public int getBusNumber() {
        return busNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setAc(boolean val) {
        ac = val;
    }

    public void setCapacity(int cap) {
        capacity = cap;
    }

    // Method to check if the bus has AC
    public boolean isAc() {
        return ac;
    }

    // Method to display bus information
    public void displaybusinfo() {
        System.out.println("BUS NO: " + busNo + ", AC: " + ac + ", TOTAL CAPACITY: " + capacity);
    }
}
