public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
        FreshJuice juice = new FreshJuice();

        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Size: " + juice.size);
    }
}

class FreshJuice{
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}