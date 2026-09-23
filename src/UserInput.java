import java.util.Scanner;

public class UserInput{
    public static void main(String []args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = userInput.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = userInput.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is "+ sum);
        userInput.close();
    }
}