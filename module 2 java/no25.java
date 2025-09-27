// 25. Custom exception - Bank
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String s){ super(s); }
}
class BankAcc {
    int bal=2000;
    void withdraw(int amt) throws InsufficientBalanceException {
        if(amt>bal) throw new InsufficientBalanceException("Sorry, insufficient balance, you need more "+(amt-bal)+" Rs.");
        else bal-=amt;
    }
    public static void main(String[] args) throws Exception {
        BankAcc a=new BankAcc();
        a.withdraw(2500);
    }
}
