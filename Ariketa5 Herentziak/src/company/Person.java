package company;

public class Person {

    private String name;
    private String dni;
    private double height;
    private int weight;

    public Person(String name, String dni, double height, int weight){
        this.name=name;
        this.dni=dni;
        this.height=height;
        this.weight=weight;
    }

    public Person(String dni){
        this.name=null;
        this.height=0;
        this.weight=0;
        this.dni=dni;
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String toString(){
        return ("Izena: " + this.name + " Wwight= " + this.weight);
    }
}
