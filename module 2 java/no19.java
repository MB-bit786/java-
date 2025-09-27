// 19. Shape hierarchy
class Shape { void print(){ System.out.println("This is shape"); } }
class Rectangle2 extends Shape { void print(){ System.out.println("This is rectangular shape"); } }
class Circle extends Shape { void print(){ System.out.println("This is circular shape"); } }
class Square2 extends Rectangle2 { void print(){ System.out.println("Square is a rectangle"); } }
class ShapeTest2 {
    public static void main(String[] args){
        Square2 s=new Square2();
        s.print();
        new Rectangle2().print();
    }
}