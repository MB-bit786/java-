
// 11. Member, Employee, Manager
class Member {
    String name,address;
    int age;
    String phone;
    double salary;
    void printSalary() { System.out.println(salary); }
}
class Employee extends Member {
    String specialization;
}
class Manager extends Member {
    String department;
}
class MemberTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name="Ali"; e.age=30; e.phone="123"; e.address="Ind"; e.salary=20000; e.specialization="Java";
        Manager m = new Manager();
        m.name="Raza"; m.age=40; m.phone="456"; m.address="Ind"; m.salary=50000; m.department="IT";
        System.out.println(e.name+" "+e.age+" "+e.salary);
        System.out.println(m.name+" "+m.age+" "+m.salary);
    }
}
