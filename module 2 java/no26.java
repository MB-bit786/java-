// 26. Student with custom exceptions
class AgeNotWithinRangeException extends Exception { AgeNotWithinRangeException(String s){ super(s); } }
class NameNotValidException extends Exception { NameNotValidException(String s){ super(s); } }
class Student {
    int roll,age; String name,course;
    Student(int r,String n,int a,String c) throws Exception {
        roll=r; name=n; age=a; course=c;
        if(a<15||a>21) throw new AgeNotWithinRangeException("AgeNotWithinRangeException");
        if(!n.matches("[a-zA-Z]+")) throw new NameNotValidException("NameNotValidException");
    }
    public static void main(String[] args) throws Exception {
        new Student(1,"Ali12",14,"MCA");
    }
}
