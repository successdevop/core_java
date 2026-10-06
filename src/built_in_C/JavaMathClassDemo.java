package built_in_C;

import static java.lang.Math.*;

public class JavaMathClassDemo{
    public static void main(String[] args){
        double res = Math.E;
        System.out.println("Logarithm base: "+res);

        double pi = Math.PI;
        System.out.println("PI value: "+pi);

        double absD = abs(-23.65);
        System.out.println("Absolute value: "+absD);

        double cb = cbrt(8);
        System.out.println("Cube root: "+cb);

        double srt = sqrt(25);
        System.out.println("Cube root: "+srt);

        int rnd = round(23.5f);
        System.out.println("round: "+rnd);

        double random = random();
        System.out.println("random numbers: "+random);

        double pw = pow(3, 3);
        System.out.println("raise to power: "+pw);

        double minVal = min(19,73);
        System.out.println("min value: "+minVal);

        double maxVal = max(12,3);
        System.out.println("Max value: "+maxVal);

        double hynot = hypot(4, 9);
        System.out.println("result: "+hynot);
    }
}