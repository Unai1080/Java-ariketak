//public class Main {
///    public static void main(String[] args) {
//
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sarrera = new Scanner(System.in);
        int N;
        System.out.println("Idatzi ezazu zenbaki bat: ");
        N = sarrera.nextInt();
        tabla(N);
    }

    public static void tabla(int a){
        int kont;
        kont=0;
        while (kont<11){
            System.out.println(a+" x "+kont+" = " +a*kont);
            kont++;
        }


    }


}
