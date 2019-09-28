import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount alphaBank = new BankAccount();
        alphaBank.deposit(10000);
        while (true) {
           alphaBank.withDraw(6000);
        }

    }




       }


