package exceptions.customException;

public class Main{
    public static void main(String[] args){
        CheckingAccount ca = new CheckingAccount(1234);
        System.out.println("Depositing 6000...");
        ca.deposit(6000);

        try{
            System.out.println("Withdrawing 7500...");
            ca.withdraw(7500);
        }catch(InsufficientFundException ex){
            System.out.println("Insufficient funds: "+ex.getMessage());
        }
    }
}