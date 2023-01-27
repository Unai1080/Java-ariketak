import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int zenbBikoitia, zenbakia, zenbBakoitia;
        zenbBikoitia = 0;
        zenbBakoitia = 0;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Sartu zenbaki bat: ");
        zenbakia = sarrera.nextInt();
        while (zenbakia != 0) {
            if (zenbakia % 2 == 0) {
                zenbBikoitia++;
            }else {
                zenbBakoitia++;
            }
            System.out.println("Sartu zenbaki bat: ");
            zenbakia = sarrera.nextInt();
        }
        System.out.println(zenbBikoitia+" zenbaki bikoiti sartu dituzu");
        System.out.println(zenbBakoitia+" zenbaki bakoiti sartu dituzu");
    }
}