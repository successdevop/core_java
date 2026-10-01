package oop.polymorphism;

public class CompileTimePolymorphism{
    public int addition(int x, int y){
        return x + y;
    }

    public int addition(int x, int y, int z){
        return x + y + z;
    }

    public double addition(double x, double y){
        return x + y;
    }

    public double addition(double x, double y, double z){
        return x + y + z;
    }

    public static void main(String[] args){
        CompileTimePolymorphism cmp = new CompileTimePolymorphism();
        int x = cmp.addition(23, 509);
        int y = cmp.addition(123, 234, 345);

        double z = cmp.addition(90, 80);
        double zz = cmp.addition(901, 802, 708);

        System.out.println("Addition of two integers: "+x);
        System.out.println("Addition of three integers: "+y);
        System.out.println("Addition of two doubles: "+z);
        System.out.println("Addition of three doubles: "+zz);
    }
}