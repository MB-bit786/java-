// 7. PrintNumber overloading
class PrintNumber {
    void printn(int n) { System.out.println(n); }
    void printn(double d) { System.out.println(d); }
    void printn(float f) { System.out.println(f); }
    void printn(long l) { System.out.println(l); }
    public static void main(String[] args) {
        PrintNumber p = new PrintNumber();
        p.printn(10);
        p.printn(12.5);
        p.printn(15.2f);
        p.printn(100000L);
    }
}