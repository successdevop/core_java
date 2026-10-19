package multithreading;

public class MultiThreadInheritance{
    public static void main(String[] args) {
//        Thread firstAthlete = new Thread(()->{
//            int bibNumber = 84921;
//            runRace(bibNumber);
//        });
//
//        Thread secondAthlete = new Thread(()->{
//            int bibNumber = 43114;
//            runRace(bibNumber);
//        });
//
//        firstAthlete.start();
//        secondAthlete.start();
        Athlete a1 = new Athlete(12345, "Success", 10);
        Athlete a2 = new Athlete(24681,"Faith", 2);

        a1.start();
        a2.start();
    }

    private static void runRace(int bibNumber){
        double distanceKM = 10;
        double steps = 0.00000001;

        for (double i = 0; i <= distanceKM; i += steps){
            if (Math.abs(i - distanceKM) < steps){
                System.out.println("\nAthlete number "+bibNumber+" has finished the race");
                break;
            }
        }
    }
}