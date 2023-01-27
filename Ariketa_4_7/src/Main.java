import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sarrera = new Scanner(System.in);
        int N;
        System.out.println("Zenbaki bat jarri ezazu: ");
        N = sarrera.nextInt();
        digitukopuru(N);
    }

    public static void digitukopuru(int a){
        int kont,kontdigitu;
        kont=10;
        kontdigitu=1;
        while (kont<=a){
            kont=kont*10;
            kontdigitu++;
        }
        System.out.println(a+" Zenbakia "+kontdigitu+ " digitu ditu");


    }



}
