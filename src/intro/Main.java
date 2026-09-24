package intro;

public class Main{
    public static void main(String[] args){
//        System.out.println("Hello World");
//        intro.FreshJuice juice = new intro.FreshJuice();
//
//        juice.size = intro.FreshJuice.FreshJuiceSize.MEDIUM;
//        System.out.println("Size: " + juice.size);

//        int num1 = 5004;
//        double num2 = 2.5;
//
//        double sum = (num1 + num2);
//        System.out.println(sum);

//        int num = 5004;
//        System.out.println("Stored Unicode character is: "+ '\u0043');

//        char letterA = '\u0041';
//        char letterSigma = '\u03A3';
//        char copyrightSymbol = '\u00A9';
//
//        char letterZ = 'Z';
//        char letterOmega = '\u0000';
//        char registeredSymbol = '\u0000';
//
//        System.out.println("Stored Unicode Characters using Escape Sequences:");
//        System.out.println("Letter A: " + letterA);
//        System.out.println("Greek Capital Letter Sigma: " + letterSigma);
//        System.out.println("Copyright Symbol: " + copyrightSymbol);
//        System.out.println("\nStored Unicode Characters Directly:");
//        System.out.println("Letter Z: " + letterZ);
//        System.out.println("Greek Capital Letter Omega: " + letterOmega);
//        System.out.println("Registered Symbol: " + registeredSymbol);

        char letterA = '\u0041';
        char smallLetterA = '\u0061';
        System.out.println("letter A: "+ letterA);
        System.out.println("small letter A: "+ smallLetterA);

        char letterB = 'B';

        int difference = letterA - smallLetterA;
        System.out.println("Difference between letter A and small letter A: "+ difference);

        char letterC = (char) (letterB + difference);
        char smallLetterC = (char) (letterC + 32);
        System.out.println("Calculated letter C: "+letterC);
        System.out.println("Calculated small letter c: "+smallLetterC);



    }
}

class FreshJuice{
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}