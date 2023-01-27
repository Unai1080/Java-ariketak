import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, espacios, kont, kont2;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Zenbat * fila nahi dituzu? ");
        N = sarrera.nextInt();
        kont2=1;
        for(int i=1; i<=N; i++){
            espacios=N-i;
            kont=0;
            for (int j=1; j<=i; j++){
                while (espacios!=kont){
                    System.out.print(" ");
                    kont++;
                }
                System.out.print(kont2+" ");
                kont2++;
                if (j==i){
                    System.out.println(" ");
                }
            }
        }
    }
}