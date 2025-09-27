// 24. Age validation
class Validate {
    static void check(int age){
        if(age<18) throw new ArithmeticException("not valid");
        else System.out.println("welcome to vote");
    }
    public static void main(String[] args){
        check(16);
    }
}