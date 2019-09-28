public class LimitExpection extends Exception{
private double remainingAmount;

    public LimitExpection(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
        System.out.println(" Остаток счета: " +getRemainingAmount());
    }
    public double getRemainingAmount() {
        return remainingAmount;


    }

}