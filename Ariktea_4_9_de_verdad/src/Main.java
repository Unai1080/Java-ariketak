import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kopurua, Bidaiadistantzia, kostua, merkeena, Bidaidonostimerkeena, kont, suma;
        char Jatorriletra, helmugaletra, merkeenajatorria, meerkeenahelmuga, bidaidonostimeekenahelmugo;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Zenbat bidaiko informazioa sartu nahi duzu?");
        kopurua = sarrera.nextInt();
        Bidaidonostimerkeena = 10000;
        merkeena = 10000;
        kont = 0;
        suma = 0;
        for (int i = 0; i < kopurua; i++) {
            System.out.println("Jatorriko hiriairen hasierako letra jarri");
            Jatorriletra = sarrera.next().charAt(0);
            System.out.println("Helmugaren hiriairen hasierako letra jarri");
            helmugaletra = sarrera.next().charAt(0);
            System.out.println("Bidaiaren distantzia ipini");
            Bidaiadistantzia = sarrera.nextInt();
            System.out.println("Bidaiaren kostua ipini");
            kostua = sarrera.nextInt();
            if (merkeena > kostua) {
                merkeena = kostua;
                merkeenajatorria = Jatorriletra;
                meerkeenahelmuga = helmugaletra;
            }
            if (Bidaiadistantzia > 50) {
                suma = suma + Bidaiadistantzia;
                kont = kont + 1;
            }
            if ((Jatorriletra = 'D' ) ||(Jatorriletra = 'd')){


            }
        }
    }
}
