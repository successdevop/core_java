package oop.enums;

public class EnumDemo{
    public static void main(String[] args){

        Mobile mob = Mobile.Motorola;
        if (mob == Mobile.Samsung){
            System.out.println("Matched");
        }

        switch(mob){
            case Samsung:
                System.out.println("Samsung");
                break;
            case Nokia:
                System.out.println("Nokia");
                break;
            case Motorola:
                System.out.println("Motorola");
                break;
            default:
                System.out.println("Invalid Enum type");

        }

        TrafficSignal.Light light = TrafficSignal.Light.GREEN;
        System.out.println(light);
    }
}