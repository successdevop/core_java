package java_io.file.objectStream;

import java.io.*;

public class ObjectInputStreamDemo{
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("object.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeUTF("Hello World");
            oos.flush();
            oos.close();
            fos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
            int numOfBytes = ois.available();
            ois.close();
            System.out.println("Available bytes: "+numOfBytes);
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
}

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{
        System.out.println("Inside Read Object Method in Person Class");
        ObjectInputStream.GetField fields = ois.readFields();
        String name = (String)fields.get("name", "Unknown");
        int age = fields.get("age", 0);

        if (fields.defaulted("name")){
            System.out.println("Field 'name' was defaulted (not found in stream)");
            age = 0;
        }else{
            System.out.println("Field 'name' was not defaulted");
        }
        ois.defaultReadObject();
    }

    @Override
    public String toString(){
        return "Person{name="+this.name+", age="+this.age+"}";
    }
}

class ObjectTest{
    public static void main(String[] args) {
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
            oos.writeObject(new Person("Alice", 30));
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"));
            Person person = (Person) ois.readObject();
            System.out.println("Read Object: "+person);
            ois.close();

            System.out.println("Try to read object again");
        } catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}