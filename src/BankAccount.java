public class BankAccount {
    double amount;




    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double sum) {
        amount = amount + sum;
        System.out.println("Ваш баланс:" + amount);
    }

    public void withDraw(double sum) throws LimitExpection {
        if (sum > amount) {
            throw new LimitExpection("Недостаточно суммы на счету ",amount);
        }
            amount = amount - sum;
        System.out.println("Снимаем "+sum);

    }
}

















