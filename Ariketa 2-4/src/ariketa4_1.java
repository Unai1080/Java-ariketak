import java.util.Scanner;

public class ariketa4_1 {

    public static void main(String[] args) {
        Scanner sarrera = new Scanner(System.in);
        int N;
        System.out.println("Idatzi ezazu zenbaki bat: ");
        N = sarrera.nextInt();
        System.out.println(tabla(N));
    }

    public static int tabla(int a){
        int kont;
        kont=0;
        while (kont<11){
            return(a*kont);
            kont++;
        }


    }


}
