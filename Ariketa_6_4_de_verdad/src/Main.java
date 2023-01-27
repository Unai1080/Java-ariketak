import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, zenbakia;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Zenbat segidako zenbaki nahi dituzu: ");
        N = sarrera.nextInt();
        int Num;
        Num = 4;
        int kont=0;
        System.out.print("2, 3, ");
        while (kont < N-2) {
            kont=multiplo(Num,kont);
            Num++;
        }

    }

    public static int multiplo(int a, int resultado) {
        int divisor = 2;
        boolean primo=true;
        while (divisor != a-1) {
            if (a % divisor == 0) {
                primo=false;
                break;
            }
            divisor++;
        }
        if (primo){
            System.out.print(a+ ", ");
            return(resultado+1);
        }else{
            return(resultado);
        }
    }
}