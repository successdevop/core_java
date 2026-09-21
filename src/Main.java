public class Main{
    public static void main(String []args){
        Main program = new Main();
        double result = program.divide(100, 0);
        System.out.println(result);
    }

    public double divide(int dividend, int divisor){
        if (divisor == 0){
            throw new IllegalArgumentException("divisor cannot be zero");
        }

        return (double) dividend / divisor;
    }
}