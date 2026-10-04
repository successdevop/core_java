package oop.nestedclasses;

public class OuterDemo{
    private int num = 175;

    public class InnerDemo{
        public int getNum(){
            System.out.println("This is the getNum() method of the inner class");
            return num;
        }
    }

}