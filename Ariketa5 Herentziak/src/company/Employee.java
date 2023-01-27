package company;

public class Employee extends Person{

    private float money;
    private MobilePhone phone;

    public Employee(String name, String dni, double height, int weight, float money, MobilePhone phone){
        super(name,dni,height,weight);
        this.money=money;
        this.phone=phone;
    }
    public Employee(String dni, float money, MobilePhone phone){
        super(dni);
        this.money=money;
        this.phone=phone;
    }
    public void earnMoney(float a){
        this.money=this.money+a;
    }
    public void spendMoney(float a){
        this.money=this.money-a;
    }
    public String toString(){
        return ("Izena: " + this.getName() + " Weight= " + this.getWeight() + " Money: " + this.money + " Battery: " + phone.getBattery());
    }

    public void work(){
        phone.use();
        earnMoney(10);
    }
}