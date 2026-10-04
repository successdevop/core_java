package oop.nestedclasses;

public class NestedClasses{

    private class Inner{
        public void print(){
            System.out.println("This is from Inner class");
        }
    }

    public void displayInner(){
        Inner inn = new Inner();
        inn.print();
    }

    public static void main(String[] args){
        NestedClasses nc = new NestedClasses();
        NestedClasses.Inner inn = nc.new Inner();
        nc.displayInner();
        inn.print();
    }
}

