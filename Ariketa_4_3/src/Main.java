import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sarrera = new Scanner(System.in);
        int N;
        System.out.println("Idatzi ezazu zenbaki bat: ");
        N = sarrera.nextInt();
        System.out.println("Zure zenbakieraren batukaria hau da: ");
        batukaria(N);
        System.out.println();
        System.out.println("Zure zenbakieraren faktoriala hau da: ");
        faktoriala(N);
    }

    public static void batukaria(int a) {
        int kont;
        int batuketa;
        kont = 0;
        batuketa = 0;
        while (kont < a + 1) {
            batuketa = batuketa + kont;
            System.out.print(kont);
            if (kont<a) {
                System.out.print(" + ");
            }
            kont++;
        }
        System.out.print(" = "+batuketa);


    }

    public static void faktoriala (int a) {
        int kont;
        int faktorea;
        kont = 1;
        faktorea = 1;
        while (kont < (a + 1) && a != 0) {
            faktorea = faktorea * kont;
            System.out.print(kont);
            if (kont<a) {
                System.out.print(" * ");
            }
            kont++;
        }
        System.out.print(" = "+faktorea);
        }


    }

