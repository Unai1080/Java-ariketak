import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, zenbakia;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Zenbat segidako zenbaki nahi dituzu: ");
        N = sarrera.nextInt();
        int batuketa=1;
        for (int i=2; i!=N+2; i++){
            System.out.print(batuketa+", ");
            batuketa=batuketa*i+i;
        }
    }
}