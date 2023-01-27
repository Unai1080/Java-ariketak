import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, zenbakia;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Zenbat segidako zenbaki nahi dituzu: ");
        N = sarrera.nextInt();
        int emaitza=2;
        System.out.print(" 2, ");
        for (int i=2; i!=N+1; i++){
            System.out.print(emaitza+", ");
            emaitza=emaitza*i;
        }
    }
}