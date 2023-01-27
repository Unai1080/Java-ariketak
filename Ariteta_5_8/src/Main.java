import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numasteriscos, espacios,N;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Zenbat pisu nahi duzu? ");
        N = sarrera.nextInt();
        numasteriscos = 1;
        espacios = N-1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= numasteriscos; j++) {
                System.out.print("*");
            }
            numasteriscos = numasteriscos + 2;
            espacios--;
            System.out.println(" ");
        }
        numasteriscos = numasteriscos -4;
        espacios=1;
        for (int i = 1; i <= N-1; i++) {
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= numasteriscos; j++) {
                System.out.print("*");
            }
            numasteriscos = numasteriscos - 2;
            espacios++;
            System.out.println(" ");

        }
    }
}