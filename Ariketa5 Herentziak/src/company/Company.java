package company;

public class Company {

    private String name;
    private double profit;
    private Employee employee1;
    private Employee employee2;
    private Employee owner;
    private Employee manager;

    public Company(String name, double profit, Employee employee1, Employee employee2, Employee owner, Employee manager){
        this.name= name;
        this.profit = profit;
        this.employee1=employee1;
        this.employee2= employee2;
        this.owner=owner;
        this.manager=manager;
    }

    public void hireManager(Employee a){
        this.manager=a;
    }

    public void work(){
        employee1.work();
        employee2.work();
        this.profit=this.profit+100;
    }

    public String toString(){
        return("Company name: "+this.name+" Profiy: "+this.profit+ " Employee1: "+employee1.toString()+" Employee2: "+employee2.toString()+ " Owner: " +owner.toString()+ " Manager: "+manager.toString());
    }



}
