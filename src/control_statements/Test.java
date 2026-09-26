package control_statements;

public class Test{
    public static void main(String []args){
//        double x = 30.0;
//
//        if (x == 10.0){
//            System.out.println("Value of x is 10");
//        } else if (x == 20.0) {
//            System.out.println("Value of x is 20");
//        } else if (x == 30.0){
//            System.out.println("Value of x is 30");
//        } else {
//            System.out.println("This is an else statement");
//        }

//        int x = 10, y = 20, z = 30;
//
//        if (x >= y){
//            if (x >= z){
//                System.out.println(x + " is the largest");
//            }else{
//                System.out.println(z + " is the largest");
//            }
//        }else{
//            if (y >= z){
//                System.out.println(y +" is the largest");
//            }else
//                System.out.println(z + " is the largest");
//        }
//
//        if (z % 5 == 0)
//            System.out.println("This is an even number");
//            System.out.println("Hello world");
        int grade = 13;

        switch(grade){
            case 1:
                System.out.println("Excellent");
                break;
            case 2:
            case 3:
                System.out.println("Well done");
                break;
            case 4:
                System.out.println("You passed");
                break;
            case 5:
                System.out.println("Try again");
                break;
//            default:
//                System.out.println("Invalid grade");
        }
//        System.out.println("Your grade is "+ grade);
    }
}