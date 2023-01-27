import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sarrera = new Scanner(System.in);
        int N;
        System.out.println("Idatzi ezazu zenbaki bat: ");
        N = sarrera.nextInt();
        perfecto(N);
    }

    public static void perfecto (int a){
        int divisor =1;
        int perfecto =0;
        while (divisor!=a) {
            if (a % divisor == 0) {
                perfecto = divisor + perfecto;
            }
            divisor++;
        }
        if (perfecto==a) {
            System.out.println("El numero es perfecto");
        }else{
            System.out.println("El numero no es perfecto");
        }


    }


}