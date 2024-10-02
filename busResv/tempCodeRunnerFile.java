package busResv;
public class Bus {
    private int busNo;
    private  boolean ac;
    private int capacity;

    Bus(int no,boolean ac,int cap){
        this.busNo=no;
        this.ac=ac;
        this.capacity=cap;
        
    }
    public int getCapacity() {
        return capacity;
    }
    public void setAc(boolean val){
        ac=val;
    }
    public void setCapacity(int cap){
        capacity=cap;
    }
    public void isAc(){
        return ac;
    }
    public void displaybusinfo(){
        System.out.println("BUS NO:"+busNo+"AC:"+ac+"TOTAL CAPACITY:"+capacity);

    }

    
}
