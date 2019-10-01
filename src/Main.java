public class Main {
    public static void main(String[] args)  {
        BankAccount alphaBank = new BankAccount();
        {
            alphaBank.deposit(10000.0);
            while (true)
                try {
                    if(alphaBank.getAmount()>6000){
                        alphaBank.withDraw(6000.0);
                        System.out.println("Остаток счёта"+alphaBank.getAmount());
                    }
                    else{
                        alphaBank.withDraw(4000);
                    }

                } catch (LimitExpection e) {
                    e.printStackTrace();
                    break;
                }
        }
    }
}