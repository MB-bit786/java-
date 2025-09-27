// 13. Triangle area perimeter
class Triangle {
    int a,b,c;
    Triangle(){ a=3; b=4; c=5; }
    void area(){
        double s=(a+b+c)/2.0;
        System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
    void perimeter(){ System.out.println(a+b+c); }
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area(); t.perimeter();
    }
}
