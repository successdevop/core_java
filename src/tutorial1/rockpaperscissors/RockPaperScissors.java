package tutorial1.rockpaperscissors;

import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper or scissors.");
        System.out.print("Are you ready? Write 'yes' if you are: ");
        String response = scanner.nextLine();

        if (!response.equalsIgnoreCase("yes")){
            System.out.println("Darn, some other time...");
            System.exit(0);
        }

        System.out.println("Great");
        System.out.println("rock - paper - scissors, shoot!: ");

        String yourChoice = scanner.nextLine();
        System.out.println("\nProcessing entered value...");
        if(!checkUserInput(yourChoice)){
            System.out.println("You entered the wrong value");
            System.exit(0);
        }

        String computerChoice = computerChoice();
        System.out.println("You choose: "+yourChoice+", Computer choose: "+computerChoice);

        if (yourChoice.equalsIgnoreCase(computerChoice)){
            System.out.println("It's a tie");
        } else if (checkWinner(yourChoice, computerChoice)){
            System.out.println("You won");
        }else{
            System.out.println("Computer won");
        }

        scanner.close();
    }

    public static String computerChoice(){
        String[] choices = {"paper", "rock", "scissors"};

        return choices[(int) (Math.random() * choices.length)];
    }

    public static boolean checkUserInput(String choice){
        return (choice.equalsIgnoreCase("paper") || choice.equalsIgnoreCase("rock") ||
                choice.equalsIgnoreCase("scissors"));
    }

    public static boolean checkWinner(String yourChoice, String computerChoice){
        return (
                (yourChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) ||
                        (yourChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) ||
                        (yourChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper"))
                );
    }
}