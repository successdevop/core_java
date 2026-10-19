package multithreading;

public class Athlete extends Thread{
    private int bibNumber;
    private String name;

    public Athlete(int bibNo, String name, int priority){
        this.setPriority(priority);
        this.bibNumber = bibNo;
        this.name = name;
    }

    public int getBibNumber(){
        return this.bibNumber;
    }

    public void setBibNumber(int bibNo){
        this.bibNumber = bibNo;
    }

    public String getAthleteName(){
        return this.name;
    }

    public void setAthleteName(String name){
        this.name = name;
    }

    @Override
    public void run(){
        double distanceKM = 10;
        double steps = 0.00000001;

        for (double i = 0; i <= distanceKM; i += steps){
            if(Math.abs(i - distanceKM) < steps){
                System.out.println("\n Athlete "+this.name+", number: "+this.bibNumber+", has finished the race");
                break;
            }
        }
    }
}