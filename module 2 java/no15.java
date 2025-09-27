// 15. Abstract Parent and subclasses
abstract class ParentAbs { abstract void message(); }
class First extends ParentAbs { void message(){ System.out.println("This is first subclass"); } }
class Second extends ParentAbs { void message(){ System.out.println("This is second subclass"); } }
class TestAbs {
    public static void main(String[] args){
        new First().message();
        new Second().message();
    }
}