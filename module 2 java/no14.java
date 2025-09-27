// 14. Complex number operations
import java.util.Scanner;
class Complex 
{
    int r,i;
    Complex(int r,int i){ this.r=r; this.i=i; }
    Complex add(Complex c){ return new Complex(r+c.r,i+c.i); }
    Complex sub(Complex c){ return new Complex(r-c.r,i-c.i); }
    Complex mul(Complex c){ return new Complex(r*c.r - i*c.i, r*c.i + i*c.r); }
    void print(){ System.out.println(r+"+"+i+"i"); }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Complex c1=new Complex(sc.nextInt(),sc.nextInt());
        Complex c2=new Complex(sc.nextInt(),sc.nextInt());
        c1.add(c2).print();
        c1.sub(c2).print();
        c1.mul(c2).print();
    }
}