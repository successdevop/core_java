package built_in_C;

public class CharDemo{
    public static void main(String[] args) {
        char a = 'a';
        char uniChar = '\u039A';
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};

//        System.out.println("She said \"Hello!\" to me");

        int cp = 0x12345;
        int result = Character.charCount(cp);
        System.out.println(result);
        System.out.println(cp);
    }
}