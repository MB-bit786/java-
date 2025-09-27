// 16. Abstract Bank
abstract class Bank { abstract void getBalance(); }
class BankA extends Bank { void getBalance(){ System.out.println("$100"); } }
class BankB extends Bank { void getBalance(){ System.out.println("$150"); } }
class BankC extends Bank { void getBalance(){ System.out.println("$200"); } }
class BankTest {
    public static void main(String[] args){
        new BankA().getBalance();
        new BankB().getBalance();
        new BankC().getBalance();
    }
}