// 9. Area of square and rectangle
class Area {
    void area(int side) { System.out.println(side*side); }
    void area(int l,int b) { System.out.println(l*b); }
    public static void main(String[] args) {
        Area a = new Area();
        a.area(5);
        a.area(5,10);
    }
}