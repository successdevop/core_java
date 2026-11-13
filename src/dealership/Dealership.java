package dealership;

public class Dealership{
    private final Car[] cars;

    public Dealership(Car[] cars){
        this.cars = new Car[cars.length];
        for (int i = 0; i < this.cars.length; i++){
            this.cars[i] = new Car(cars[i]);
        }
    }

    public Car getCar(int index){
        Car carCopy = new Car(this.cars[index]);
        return carCopy;
    }

    public void setCar(int index, Car newCar){
        Car carCopy = new Car(newCar);
        this.cars[index] = carCopy;
    }

    public void sell(int index){
        this.cars[index].drive();
    }
}