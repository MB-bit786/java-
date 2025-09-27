// 20. Try catch division
import java.util.Scanner;
class TryCatch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        try{ System.out.println(a/b); }
        catch(Exception e){ System.out.println(e); }
    }
}