package oop.inheritance;

public class My_Calculation extends Calculation{
    public void multiplication(int x, int y){
        z = x * y;
        System.out.println("The product of the given numbers : "+z);
    }

    public static void main(String[] args){
        int x = 20, y = 9;

        My_Calculation cal = new My_Calculation();
        cal.multiplication(x, y);
        cal.addition(x,y);
        cal.subtraction(x,y);

        System.out.println(cal.z);
    }
}