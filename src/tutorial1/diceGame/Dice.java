package tutorial1.diceGame;

import java.util.Scanner;

public class Dice{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.print("Enter three numbers between 1 and 6: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        scanner.close();

        System.out.println("Processing entered values.....");
        if(isLessThanOne(num1, num2, num3) || isHigherThanSix(num1, num2, num3)){
            System.out.println("You entered a number(s) outside valid range");
            System.exit(0);
        }

        int sumTotal = num1 + num2 + num3;
        int comTotal = roll1 + roll2 + roll3;
        System.out.println("Your sum total is: "+sumTotal+", computer total is: "+comTotal);

        if (checkWinner(sumTotal,comTotal)){
            System.out.println("Congratulations, you won!!!!");
        }else{
            System.out.println("Better luck next time");
        }

    }

    public static int rollDice(){
        double randomNo = Math.random() * 6;
        return (int) (randomNo + 1);
    }

    public static boolean isLessThanOne(int num1, int num2, int num3){
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    public static boolean isHigherThanSix(int num1, int num2, int num3){
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    public static boolean checkWinner(int yourSum, int computerSum){
        return ((yourSum > computerSum) && (yourSum - computerSum < 3));
    }
}