package operators;

public class OperatorPrecedenceExample{
    public static void main(String[] args){
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 20 / 4 * 2;
        int result4 = 10 - 3 + 2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}