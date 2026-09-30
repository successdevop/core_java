package oop.aggregation;

public class Vehicle{
    private String vim;

    public String getVim(){
        return this.vim;
    }

    public void setVim(String vim){
        this.vim = vim;
    }
}

class Speed{
    private double max;

    public double getMax(){
        return this.max;
    }

    public void setMax(double max){
        this.max = max;
    }
}

class Van extends Vehicle{
    private Speed speed;

    public Speed getSpeed(){
        return this.speed;
    }

    public void setSpeed(Speed speed){
        this.speed = speed;
    }

    public void print(){
        System.out.println("Vin: "+this.getVim()+", Max speed: "+this.speed.getMax());
    }
}

class Tester{
    public static void main(String[] args){
        Speed speed = new Speed();
        speed.setMax(45.92);

        Van van = new Van();
        van.setSpeed(speed);

        van.setVim("Toyota Highlander");
        van.print();
    }
}