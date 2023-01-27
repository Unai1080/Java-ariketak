import java.util.Scanner;

public class Ariketa3_1 {
    public static void main(String[] args) {
        Scanner sarrera = new Scanner(System.in);
        int ikasgaikodea, kontikasgaia, ikasgaiorduak, ikasgaikasle, kontikasle, kalprak, kalteo, sumaprac, kantprac, ikasgaiorduaksuma, ikasgaiorduakont, notahandiena, ikasgaienorduenbabez, ikaslebabezpracteo;
        char sexua, sexua1;
        kontikasgaia = 1;
        kontikasle = 1;
        sumaprac = 0;
        ikasgaiorduaksuma = 0;
        notahandiena = 0;
        ikasgaienorduenbabez = 0;
        ikasgaiorduakont = 0;
        kantprac=0;
        sexua1= 1;
        while (kontikasgaia != 6) {
            System.out.println("Ikasgaiaren kodea idatzi ezazu: ");
            ikasgaikodea = sarrera.nextInt();
            System.out.println("Ikasgaiaren ordu kopurua astero idatzi ezazu: ");
            ikasgaiorduak = sarrera.nextInt();
            System.out.println("Ikasle kopurua adierazi ezazu: ");
            ikasgaikasle = sarrera.nextInt();
            if (ikasgaiorduak > 8) {
                ikasgaiorduaksuma = ikasgaiorduaksuma + ikasgaiorduak;
                ikasgaiorduakont++;
            }
            ikasgaienorduenbabez = ikasgaienorduenbabez + ikasgaiorduak;
            while (kontikasle != ikasgaikasle + 1) {
                System.out.println("Ikaslearen sexua adierazi: ");
                sexua = sarrera.next().charAt(0);
                System.out.println("Ikaslearen kalifikazio praktikoa adierazi: ");
                kalprak = sarrera.nextInt();
                System.out.println("Ikaslearen kalifikazio teorikoa adierazi: ");
                kalteo = sarrera.nextInt();
                sumaprac = sumaprac + kalprak;
                if (kalprak > notahandiena) {
                    notahandiena = kalprak;
                    sexua1 = sexua;
                }
                if (ikasgaiorduak >= 5 && ikasgaiorduak <= 15) {
                    System.out.println("kalifikazioen bataz bestekoa: " + (kalprak + kalteo) / 2);
                }
                kontikasle++;
            }
            System.out.println("Ikaslearen sexua nota praktiko handienaren arabera" + sexua1 + "eta bere nota " + notahandiena);
            kantprac = kontikasle + kantprac;
            notahandiena = 0;
            kontikasle = 1;
            kontikasgaia = kontikasgaia + 1;
        }
        ikasgaienorduenbabez = ikasgaienorduenbabez / 5;
        ikasgaiorduaksuma = ikasgaiorduaksuma / ikasgaiorduakont;
        sumaprac = sumaprac / kantprac;
        System.out.println("zortzi ordu baino gehiago dute ikasgaien orduen bataz bestekoa: " + ikasgaiorduaksuma);
        System.out.println("Batazbesteko ordu kopurua" + ikasgaienorduenbabez);

    }
}

