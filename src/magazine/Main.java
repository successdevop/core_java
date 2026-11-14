package magazine;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
//        Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
//        System.out.println(magazine1.getTitle());


//         Uncomment the following line to test invalid input for setTitle method
//         magazine1.setTitle("");


        // Uncomment the following line to test invalid input for setPublisher method
//         magazine1.setPublisher("");


        // Uncomment the following line to test invalid input for setIssueNumber method
//         magazine1.setIssueNumber(-1);


        // Uncomment the following line to test invalid input for setPublicationYear method
//         magazine1.setPublicationYear(0);


        // Uncomment the following line to test invalid input for the constructor
//         Magazine magazine2 = new Magazine("love", "Publisher 2", 2, 2020);
//         Magazine magazine3 = new Magazine(magazine2);
//         magazine3.setIssueNumber(0);

//        Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
//        Magazine magazine2 = new Magazine("Magazine 2", "Publisher 2", 2, 2021);
//
//        MagazineLibrary magaLibrary = new MagazineLibrary();
//
//        magaLibrary.addMagazine(magazine1);
//        magaLibrary.addMagazine(magazine2);
//        System.out.println();
//
//        Magazine retrieveMagazine = magaLibrary.getMagazine(0);
//        System.out.println(retrieveMagazine.getTitle());
//
//        Magazine newMagazine = new Magazine("Magazine 3", "Publisher 3", 3, 2022);
//        magaLibrary.setMagazine(0, newMagazine);
//
//        retrieveMagazine = magaLibrary.getMagazine(0);
//        System.out.println(retrieveMagazine.getTitle());

        Scanner scanner = new Scanner(System.in);


        String title = promptForTitle(scanner);
        String publisher = promptForPublisher(scanner);
        int issueNumber = promptForIssueNumber(scanner);
        int publicationYear = promptForPublicationYear(scanner);


        Magazine newMagazine = new Magazine(title, publisher, issueNumber, publicationYear);


        MagazineLibrary library = new MagazineLibrary();
        library.addMagazine(newMagazine);


        System.out.println("Magazine added to the library: " + newMagazine.getTitle());
    }

    public static boolean isNullOrBlank(String input){
        return (input == null || input.isBlank());
    }

    public static boolean incorrectIssueNumber(int issueNumber){
        return issueNumber <= 0;
    }

    public static boolean incorrectPublicationYear(int publicationYear){
        return publicationYear <= 0;
    }

    public static String promptForTitle(Scanner scanner){
        while(true){
            System.out.println("Please enter a valid title: ");
            String title = scanner.nextLine();
            if(title != null && !title.isBlank()) return title;
        }
    }

    public static String promptForPublisher(Scanner scanner){
        while(true){
            System.out.println("Please enter a valid Publisher: ");
            String publisher = scanner.nextLine();
            if(publisher != null && !publisher.isBlank()) return publisher;
        }
    }

    public static int promptForIssueNumber(Scanner scanner){
        while(true){
            System.out.println("Please enter a valid number: ");
            try{
                String issueNumber = scanner.nextLine();
                return Integer.parseInt(issueNumber);
            }catch (NumberFormatException ex){
                System.err.println("Please enter a valid whole number");
            }
        }
    }

    public static int promptForPublicationYear(Scanner scanner){
        while(true){
            System.out.println("Please enter a valid year: ");
            try{
                String issueNumber = scanner.nextLine();
                return Integer.parseInt(issueNumber);
            }catch (NumberFormatException ex){
                System.err.println("Please enter a valid whole number");
            }
        }
    }
}