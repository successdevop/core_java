package contact;

public class Main{
    public static void main(String[] args){
        Contact[] contacts = new Contact[]{
                new Contact("Alice", "123-456-7890", "1990-01-01"),
                new Contact("Bob", "234-567-8901", "1992-02-02"),
                new Contact("Charlie", "345-678-9012", "1994-03-03"),
                new Contact("David", "456-789-0123", "1996-04-04")
        };

        Contact newC = new Contact("Bob", "234-567-8901", "1992-02-02");

        ContactManager contactManager = new ContactManager(contacts);

        for (int i = 0; i < 10; i++){
            if(contactManager.getContact(i) == null) continue;
            System.out.println(contactManager.getContact(i));
        }

//        Contact copyContact1 = contactManager.getContact(3);
//        System.out.println(copyContact1);
//        System.out.println();
//        System.out.println(contactManager.getContact(0));
//
//        contactManager.setContact(0, newC);
//        System.out.println(contactManager.getContact(0));
//        System.out.println();
//        System.out.println();
    }
}