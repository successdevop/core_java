package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo{
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Shaggy", 3));
        dogs.add(new Dog("Lacy", 2));
        dogs.add(new Dog("Roger", 10));
        dogs.add(new Dog("Tommy", 4));
        dogs.add(new Dog("Tammy", 1));

        System.out.println(dogs);

        System.out.println("Sort the list by names");
        Collections.sort(dogs);
        System.out.println(dogs);

        System.out.println("Sort the list by comparator and age");
        dogs.sort(new Dog());
        System.out.println(dogs);

        System.out.println("sort by name in reverse order");
        dogs.sort(Collections.reverseOrder());
        System.out.println(dogs);

    }
}

class Dog implements Comparator<Dog>, Comparable<Dog> {
    private String name;
    private int age;

    public Dog(){}

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Dog dog) {
        return (this.name).compareTo(dog.name);
    }

    @Override
    public int compare(Dog d1, Dog d2) {
        return d1.age - d2.age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}