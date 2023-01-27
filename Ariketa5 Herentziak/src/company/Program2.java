package company;

public class Program2 {
    public static void main(String[] args) {
        MobilePhone p1 = new MobilePhone("+666", 97);
        Employee e1 = new Employee("Fernando", "7335562X", 1.45, 55, 1555, p1);
        MobilePhone p2 = new MobilePhone("+777", 99);
        Employee e2 = new Employee("Cristobal", "7335332X", 1.95, 90, 1105, p2);
        MobilePhone p3 = new MobilePhone("+999", 80);
        Employee owner = new Employee("Pablo", "7332342X", 1.75, 85, 20500, p3);
        MobilePhone p4 = new MobilePhone("+111", 63);
        Employee manager = new Employee("Ricardo", "9945662X", 1.68, 80, 6050, p4);

        Company adidas = new Company("Adidas", 199800, e1, e2, owner, manager);
        System.out.println(adidas.toString());
        adidas.work();
        adidas.work();
        System.out.println(adidas.toString());

    }
}
