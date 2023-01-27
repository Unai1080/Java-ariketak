import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sarrera = new Scanner(System.in);
       System.out.println("Zure izena ajrri ezazu: ");
       String izena= sarrera.next();
       System.out.println("Zure saldoa jarri ezazu: ");
       double dinero= sarrera.nextDouble();
       Cuenta usuario1;
       if (dinero == 0){
           usuario1= new Cuenta(izena);
       }else{
           usuario1= new Cuenta(dinero, izena);
       }
       usuario1.deposito(1000);
       usuario1.retiro(100);
       usuario1.mostrar();
    }
}