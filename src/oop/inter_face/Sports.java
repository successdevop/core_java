package oop.inter_face;

public interface Sports{
    public static final int zero = 1_000_000;
    void setHomeTeam(String name);
    void setVisitingTeam(String name);
}

interface Football extends Sports{
    void homeTeamScored(int points);
    void visitingTeamScored(int points);
    void endOfQuarter(int quarter);
}

interface Hockey extends Sports{
    void homeGoalScored();
    void visitingGoalScored();
    void endOfPeriod(int period);
    void overtimePeriod(int overtimePeriod);
}

interface Event extends Hockey {
    void organise();
}

class HockeyDemo implements Event{
    private int period;
    private int ovt_period;
    private String home_team_name;
    private String visiting_team_name;


    @Override
    public void homeGoalScored() {
        System.out.println("Home goals scored");
    }

    @Override
    public void visitingGoalScored() {
        try{

            System.out.println("Visiting goals scored");

        } catch(Exception e){
            System.out.println("No exceptions "+e);
        }
    }

    @Override
    public void endOfPeriod(int period) {
        this.period = period;
    }

    @Override
    public void overtimePeriod(int overtimePeriod) {
        this.ovt_period = overtimePeriod;
    }

    @Override
    public void setHomeTeam(String name) {
        System.out.println("Home team: "+name);
        this.home_team_name = name;
    }

    @Override
    public void setVisitingTeam(String name) {
        System.out.println("Visiting team: "+name);
        this.visiting_team_name = name;
    }

    @Override
    public void organise(){
        System.out.println("Events organised");
    }

    public static void main(String[] args){
        HockeyDemo hky = new HockeyDemo();

        hky.homeGoalScored();
        hky.visitingGoalScored();
        hky.setHomeTeam("Tigers");
        hky.setVisitingTeam("Lakers");

        hky.organise();
    }
}