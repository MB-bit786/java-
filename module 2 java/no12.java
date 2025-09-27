// 12. Rectangle and Square inheritance
class Rectangle {
    int length,breadth;
    Rectangle(int l,int b){ length=l; breadth=b; }
    void area(){ System.out.println(length*breadth); }
    void perimeter(){ System.out.println(2*(length+breadth)); }
}
class Square extends Rectangle {
    Square(int s){ super(s,s); }
}
class ShapeTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,10);
        Square s = new Square(5);
        r.area(); r.perimeter();
        s.area(); s.perimeter();
    }
}