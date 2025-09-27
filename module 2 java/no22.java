// 22. Nested try-catch
class NestedTry {
    public static void main(String[] args){
        try{
            try{ int a=10/0; }
            catch(ArithmeticException e){ System.out.println("Arithmetic"); }
        }catch(Exception e){ System.out.println("Outer"); }
    }
}
