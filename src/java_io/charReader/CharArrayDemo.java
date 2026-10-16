package java_io.charReader;

import java.util.Arrays;

public class CharArrayDemo{
    public static void main(String[] args) {
        char[] strArr = "Hello everyone, i'm so excited about today and the love of God".toCharArray();
        System.out.println(Arrays.toString(strArr));
        String content = new String(strArr);
        System.out.println(content);
    }
}