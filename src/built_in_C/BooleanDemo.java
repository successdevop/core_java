package built_in_C;

public class BooleanDemo{
    public static void main(String[] args){
        Boolean b1, b2;

        b1 = Boolean.valueOf(true);
        b2 = Boolean.valueOf(false);

        int res;

        res = b1.compareTo(b2);

        System.out.println(res);
        String str1 = "Both values are equal";
        String str2 = "ObjectValue is true";
        String str3 = "ArgumentValue is true";

        if (res == 0){
            System.out.println(str1);
        } else if (res > 0){
            System.out.println(str2);
        }else{
            System.out.println(str3);
        }
    }
}