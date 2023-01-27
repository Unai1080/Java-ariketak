import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Zenbaki bat jarri ezazu: ");
        long num1= sarrera.nextLong();
        Palindromo pal1= new Palindromo(num1);
        if (pal1.esPalindromo()){
            System.out.println("Zure zenbakia palindromoa da");
        }else{
            System.out.println("Zure zenbakia ez da palindromoa");
        }
    }
}