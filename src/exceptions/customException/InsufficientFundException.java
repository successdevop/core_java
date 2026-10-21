package exceptions.customException;

public class InsufficientFundException extends Exception{
    private final double amount;

    InsufficientFundException(double amt){
        this.amount = amt;
    }

    @Override
    public String getMessage(){
        return "You need extra $"+this.amount;
    }
}