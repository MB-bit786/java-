// 8. Method overloading (int,char and char,int)
class PrintIntChar {
    void show(int n, char c) { System.out.println(n + " " + c); }
    void show(char c, int n) { System.out.println(c + " " + n); }
    public static void main(String[] args) {
        PrintIntChar p = new PrintIntChar();
        p.show(5,'A');
        p.show('B',10);
    }
}
