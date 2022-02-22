public class UserException {
    public static void main(String args[]) {
        Bank b = new Bank();
        try {
            b.withdraw(0, 20000);
        }
        catch (ExcessiveAmountException e) {
            System.out.println(e);
        }
        catch (InsufficientAmountException e) {
            System.out.println(e);
        }
    }
}

class InsufficientAmountException extends Exception {
    long amount;
    InsufficientAmountException(long amount) {
        this.amount = amount;
    }
}

class ExcessiveAmountException extends Exception {
    long amount;
    ExcessiveAmountException(long amount) {
        this.amount = amount;
    }
}

class Bank {
    static long MaximumAmount = 15000;
    public void withdraw(long accNo, long amount)
        throws InsufficientAmountException, ExcessiveAmountException {
        long balance = getBalance(accNo);
        if(balance < amount)
            throw new InsufficientAmountException(amount);
        if(amount > MaximumAmount)
            throw new ExcessiveAmountException(amount);
        //else withdraw...
    }
    private long getBalance(long accNo) { return 0;}
}