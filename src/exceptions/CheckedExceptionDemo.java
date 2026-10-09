package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo{
    public static void main(String[] args) {
        String file_name = "/Users/raphtech/IdeaProjects/core_java/src/exceptions/file.txt";
        try{
            File file = new File(file_name);
            FileReader fr = new FileReader(file);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

class UncheckedExceptionDemo{
    public static void main(String[] args){
        try{
            int[] nums = {1,2,3,4};
            System.out.println(nums[4]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Out of the block");
    }
}

class ExceptTest{
    public static void main(String[] args) {
        int[] num = new int[2];

        try{
            System.out.println(num[2]);
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally{
            num[0] = 23;
            System.out.println("First Element value: "+num[0]);
            System.out.println("The finally statement is executed!!!");
        }
    }
}

class ReadDataDemo{
    public static void main(String[] args){
        FileReader fr = null;
        try{
            fr = new FileReader(new File("unchecked.txt"));
            char[] a = new char[50];
            fr.read(a);

            for(char c : a)
                System.out.println(c);

        } catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                fr.close();;
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}

class Try_With_Demo{
    public static void main(String[] args) {
        try(FileReader fr = new FileReader(new File("checked.txt"))){
            char[] ch = new char[50];

            fr.read(ch);

            for(char cVal: ch){
                System.out.println(cVal);
            }

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

class InsufficientFundsException extends Exception{
    private double amount;

    public InsufficientFundsException(double amt){
        this.amount = amt;
    }

    public double getAmount(){
        return this.amount;
    }
}

class CheckingAccount{
    private double balance;
    private int number;

    public CheckingAccount(int num){
        this.number = num;
    }

    public void deposit(double amount){
        System.out.println("Deposited #"+amount+" cash to the bank");
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        System.out.println("Withdrawing "+amount+" ...");
        System.out.println("Processing...");
        if (amount > this.balance){
            double needs = amount - this.balance;
            throw new InsufficientFundsException(needs);
        }
        this.balance -= amount;
        System.out.println("Withdrew #"+amount+" from my account balance today.");
    }

    public double getBalance(){
        return this.balance;
    }

    public int getNumber(){
        return this.number;
    }

    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(12345);
        ca.deposit(5000);
        try{
            ca.withdraw(3000);
            System.out.println("Bank balance: "+ca.getBalance());
            System.out.println("Account number: "+ca.getNumber());
        } catch (InsufficientFundsException e){
            System.out.println("Insufficient funds, you are short #"+e.getAmount());
        }
    }
}