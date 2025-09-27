// 10. Parent and child class
class Parent {
    void msg() { System.out.println("This is a parent class"); }
}
class Child extends Parent {
    void msg2() { System.out.println("This is child class"); }
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.msg();
        c.msg2();
        c.msg();
    }
}