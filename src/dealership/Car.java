package dealership;

import java.util.Arrays;

public class Car{
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] spareParts;

    public Car(String make, double price, int year, String color, String[] parts){
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.spareParts = parts;
    }

    public Car(Car source){
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.spareParts = Arrays.copyOf(source.spareParts, source.spareParts.length);
    }

    public void drive(){
        System.out.println("Driving...");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String[] spareParts) {
        this.spareParts = spareParts;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", spareParts=" + Arrays.toString(spareParts) +
                '}';
    }
}