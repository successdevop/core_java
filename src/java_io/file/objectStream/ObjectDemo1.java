package java_io.file.objectStream;

import java.io.*;

public class ObjectDemo1{
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person_data1.bin"))){
            Person person = new Person("Abigail", 18);
            oos.writeObject(person);

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person_data1.bin"));
            Person psn = (Person) ois.readObject();
            System.out.println(psn);
        }catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}

class ObjectDemo2{
    public static void main(String[] args) {
        try{
            ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("user.ser"));
            ous.writeObject(new User("Success", "1234@/.com"));
            ous.close();
            System.out.println("Data written successfully");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    static class User implements Serializable{
        public static final long serialVersionUID = 1L;
        String name;
        transient String password;

        User(String name, String password){
            this.name = name;
            this.password = password;
        }

        private void writeObject(ObjectOutputStream ous) throws IOException{
            System.out.println("Inside User class");
            ous.defaultWriteObject();
            ous.writeUTF(password);
        }
    }
}
