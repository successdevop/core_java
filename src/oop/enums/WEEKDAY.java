package oop.enums;

public enum WEEKDAY{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public String toString(){
       return switch (this) {
           case MONDAY -> "Day 1";
           case TUESDAY -> "Day 2";
           case WEDNESDAY -> "Day 3";
           case THURSDAY -> "Day 4";
           case FRIDAY -> "Day 5";
           case SATURDAY -> "Day 6";
           case SUNDAY -> "Day 7";
       };

    }

    public static void main(String[] args){
        System.out.println(WEEKDAY.MONDAY);

        System.out.println(WEEKDAY.TUESDAY.toString());

        System.out.println(WEEKDAY.WEDNESDAY.name());
    }

//    MONDAY{
////        @Override
//        public String toString(){
//            return "Day 1 of the week: Monday";
//        }
//    };
//
//    public String toString(){
//        return "Day 1 of the enum week: Monday";
//    }
//
//    public static void main(String[] args){
//        WEEKDAY wkd = WEEKDAY.MONDAY;
//        System.out.println(wkd);
//    }

//    MONDAY("Day 1"),
//    TUESDAY("Day 2"),
//    WEDNESDAY("Day 3"),
//    THURSDAY("Day 4"),
//    FRIDAY("Day 5"),
//    SATURDAY("Day 6"),
//    SUNDAY("Day 7");
//
//    private final String description;
//
//    private WEEKDAY(String description){
//        this.description = description;
//    }
//
//    public String getDescription(){
//        return this.description;
//    }
}