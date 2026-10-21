package exceptions.customException;

public class CheckingAccount{
    private double balance;
    private int number;

    CheckingAccount(int num){
        this.number = num;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amt) throws InsufficientFundException{
        if (amt > this.balance){
            double needs = amt - this.balance;
            throw new InsufficientFundException(needs);
        }

        this.balance -= amt;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getNumber(){
        return this.number;
    }
}