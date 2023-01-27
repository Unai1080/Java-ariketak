import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        boolean zero;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Zenbat * fila nahi dituzu? ");
        N = sarrera.nextInt();
        for (int i = 2; i <= N; i++) {
            if (i%2==0){
                zero=true;
            }else{
                zero=false;
            }
            for (int j = 1; j <= i; j++) {
                if (zero==true){
                    System.out.print("0");
                    zero=false;
                }else{
                    System.out.print("1");
                    zero=true;
                }

                if (j == i) {
                    System.out.println(" ");
                }
            }
        }
    }
}