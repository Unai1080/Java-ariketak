import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sarrera = new Scanner(System.in);
        int N;
        System.out.println("Zenbaki bat jarri ezazu: ");
        N = sarrera.nextInt();
        digitubatuketa(N);
    }

    public static void digitubatuketa(int a){
        int hondarra, suma;
        hondarra=0;
        suma=0;
        while (a>0){
            if (a !=0){
                hondarra= a%10;
                suma=suma+hondarra;
                a=a/10;

            }
        }
    System.out.println("Zenbakiaren digituen gehiketa hau da: "+suma);


    }



}