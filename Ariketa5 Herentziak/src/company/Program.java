package company;

public class Program {
    public static void main(String[] args) {
        MobilePhone p1 = new MobilePhone("+666", 97);
        Employee e1 = new Employee( "Fernando","7335562X", 1.45, 55, 1555, p1);
        System.out.println(e1.toString());
        e1.work();
        e1.work();
        System.out.println(e1.toString());
    }
}
