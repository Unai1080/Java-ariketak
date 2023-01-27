import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int zabalera, altura, espacios;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Zenbat zabalera nahi duzu? ");
        zabalera = sarrera.nextInt();
        System.out.println("Zenbat altura nahi duzu? ");
        altura = sarrera.nextInt();
        espacios=zabalera-2;
        for(int i=1; i<=zabalera; i++){
            System.out.print("* ");
        }
        System.out.println(" ");
        for (int i=1; i<=altura-2; i++){
            if (zabalera!=1) {
                System.out.print("*");
            }
            for(int j=1; j<=espacios; j++){
                System.out.print("  ");
            }
            if (zabalera!=1) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=1; i<=zabalera && altura!=1; i++){
            System.out.print("* ");
        }
    }
}
