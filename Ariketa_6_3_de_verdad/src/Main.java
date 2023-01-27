import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, zenbakia;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Zenbat segidako zenbaki nahi dituzu: ");
        N = sarrera.nextInt();
        int batuketa=0;
        int batuketa2=0;
        int emaitza=2;
        System.out.print("2, ");
        for (int i=1; i!=N; i++){
            batuketa2=i*6;
            batuketa=batuketa+batuketa2;
            emaitza=emaitza+batuketa;
            System.out.print(emaitza+", ");
        }
    }
}