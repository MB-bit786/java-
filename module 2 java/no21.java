// 21. Multiple catch
class MultiCatch {
    public static void main(String[] args){
        try{ int a[]=new int[5]; a[5]=30/0; }
        catch(ArithmeticException e){ System.out.println("divide by zero"); }
        catch(ArrayIndexOutOfBoundsException e){ System.out.println("index error"); }
    }
}