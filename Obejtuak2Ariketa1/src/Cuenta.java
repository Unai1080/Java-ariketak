public class Cuenta {

    private double saldo;
    private Persona titular;
    private boolean rojos;

    public Cuenta(String a, String b, int c){
        this.saldo=0;
        this.titular= new Persona(a, b, c);
        this.rojos=false;
    }

    public Cuenta(double a, String b, String c, int d){
        this.saldo=a;
        this.titular= new Persona(b, c, d);
        this.rojos=false;
    }
    public void deposito(double a){
        this.saldo=a+this.saldo;
        if (this.saldo>0){
            this.rojos=false;
        }
    }
    public void retiro(double a){

        this.saldo = this.saldo - a;
        if (this.saldo<0){
            this.rojos=true;
        }
    }
    public void mostrar(){
        titular.muestra();
        System.out.println("Zure saldoa: "+this.saldo);
        if (this.rojos) {
            System.out.println("Zure kontua zenbaki gorrietan dago");
        }else{
            System.out.println("Zure kontua ez dago zenbaki gorrietan");
        }
    }
}
