package BusReservation;

public class Bus {
   private int BusNo;
    private boolean ac;
    private int capacity;
    Bus(int no,boolean ac,int cap){
        this.BusNo=no;
        this.ac=ac;
        this.capacity=cap;
    }
    public int getBusNo(){
        return BusNo;
    }
    public boolean isAC(){
        return ac;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setAc(boolean val){
        ac=val;
    }
    public void setCapcity(int cap){
        capacity=cap;
    }
    public void Businfo(){
        System.out.println("BusNo: "+ BusNo +" AC: "+ ac +" Capacity: "+capacity);
    }
    
}
