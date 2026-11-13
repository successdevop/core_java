package dealership;

public class Person{
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, String[] passport, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = passport;
        this.seatNumber = seatNumber;
    }

    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.passport = source.passport;
        this.seatNumber = source.seatNumber;
    }
}