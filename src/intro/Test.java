public class Test{
    public static void main(String []args){
        byte byteValue1 = 2;
        byte byteValue2 = 4;
        byte byteResult = (byte) (byteValue1 + byteValue2);
        System.out.println("byte: " + byteResult);

        short shortValue1 = 2;
        short shortValue2 = 4;
        short shortResult = (short) (shortValue1 + shortValue2);
        System.out.println("short: "+shortResult);

        int intValue1 = 2;
        int intValue2 = 4;
        int intResult = intValue1 + intValue2;
        System.out.println("int: "+intResult);

        long longValue1 = 2L;
        long longValue2 = 4L;
        long longResult = longValue1 + longValue2;
        System.out.println("long: "+longResult);

        float floatValue1 = 2f;
        float floatValue2 = 4f;
        float floatResult = floatValue1 + floatValue2;
        System.out.println("float: "+floatResult);

        double dValue1 = 2d;
        double dValue2 = 4d;
        double dResult = dValue1 + dValue2;
        System.out.println("double: "+dResult);

        boolean is_valid = true;
        boolean is_valid2 = false;
        System.out.println("boolean: "+is_valid + " "+is_valid2);

        char letterA = 'A';
        System.out.println("char: "+letterA);



//        Test test = new Test();
//        test.pupAge();
    }

    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is: " + age);
    }
}