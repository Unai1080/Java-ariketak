import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        int kont=0;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Zenbat * fila nahi dituzu? ");
        N = sarrera.nextInt();
        for(int i=1; i<=N; i++){
            for (int j=1; j<=i; j++){
                System.out.print(kont+" ");
                kont++;
                if (j==i){
                    System.out.println(" ");
                }
            }
        }
    }
}