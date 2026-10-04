package oop.anonymous_class;

public class Tester{
    public static void main(String[] args){
        Car car = new Car();
        car.engineType();

        Car c2 = new Car(){
            @Override
            public void engineType(){
                System.out.println("V2 Engine");
            }
        };
        c2.engineType();

        Software sft = new Software(){
            @Override
            public void develop(){
                System.out.println("FINTECH development underway");
            }

            @Override
            public void build() {
                System.out.println("Building");
            }
        };
        sft.develop();
        sft.build();
        System.out.println(sft.getClass().getName());
        System.out.println();

        Vehicle vhc = new Vehicle();

        vhc.transport(new Engine(){
            @Override
            public void engineType(){
                System.out.println("Anonymous Engine");
            }
        });

        System.out.println();
        Engine eng = new Engine(){
            @Override
            public void engineType(){
                System.out.println("Abstract class extended by an anonymous inner class");
            }
        };
        eng.engineType();
    }
}