package operators;

public class AssignmentExample{
    public static void main(String []args){
//        int a = 10;
//
//        // Assign and add
//        a += 5;
//        System.out.println("a += 5 = " + a);
//        // Assign and subtract
//        a -= 3;
//        System.out.println("a -= 3 = " + a);
//        // Assign and multiply
//        a *= 2;
//        System.out.println("a *= 2 = "+ a);
//        // Assign and divide
//        a /= 4;
//        System.out.println("a /= 4 = " + a);
//        // Assign and modulus
//        a %= 5;
//        System.out.println("a %= 5 = "+ a);

//        int a = 10;
//        int b = 20;
//        int c = 0;
//
//        c = a + b;
//        System.out.println("c = a + b : "+ c); //30
//
//        c += a;
//        System.out.println("c += a : "+ c); //40
//
//        c -= a;
//        System.out.println("c -= a : "+ c); //30
//
//        c *= a;
//        System.out.println("c *= a : "+ c); //300

        int a = 10, c = 15;

        c /= a;
        System.out.println("c /= a : "+ c); // 1.5

        c = 15;
        c %= a;
        System.out.println("c %= a : "+ c); //5

        c = 15;
        c &= a;
        System.out.println("c &= a : "+ c);

        c = 15;
        c ^= a;
        System.out.println("c ^= a : "+ c);

        c = 15;
        c |= a;
        System.out.println("c |= a : "+ c);
    }
}