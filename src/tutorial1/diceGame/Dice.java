package tutorial1.diceGame;

public class Dice{
    public static void main(String[] args) {
        System.out.println(rollDice());
        System.out.println(rollDice());
        System.out.println(rollDice());
    }

    public static int rollDice(){
        double randomNo = Math.random() * 6;
        return (int) (randomNo + 1);
    }
}