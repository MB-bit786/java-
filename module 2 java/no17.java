// 17. Abstract Marks
abstract class Marks { abstract double getPercentage(); }
class A extends Marks {
    int m1,m2,m3;
    A(int a,int b,int c){ m1=a;m2=b;m3=c; }
    double getPercentage(){ return (m1+m2+m3)/3.0; }
}
class B extends Marks {
    int m1,m2,m3,m4;
    B(int a,int b,int c,int d){ m1=a;m2=b;m3=c;m4=d; }
    double getPercentage(){ return (m1+m2+m3+m4)/4.0; }
}
class MarksTest {
    public static void main(String[] args){
        A a=new A(90,80,70);
        B b=new B(90,85,75,95);
        System.out.println(a.getPercentage());
        System.out.println(b.getPercentage());
    }
}