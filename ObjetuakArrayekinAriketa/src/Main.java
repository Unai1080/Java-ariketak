import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gela array1 = new Gela();
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Menua");
        System.out.println("1 Sakatuz ikasle baten datuak sartzelko");
        System.out.println("2 Sakatuz ikasle baten datuak jartzeko");
        System.out.println("3 Sakatuz ikasle guztien datuak jartzeko");
        System.out.println("4 Sakatuz nota guztien bataz bestekoa jarriko du");
        System.out.println("5 Sakatuz nota altuena daukan izena eta nota jarriko du");
        System.out.println("6 Sakatuz nota baxuena daukan izena eta nota jarriko du");
        System.out.println("0 Sakatuz ateratzeko");
        int menua = sarrera.nextInt();
        while (menua!=0 && menua<7 && menua>=0){
            switch (menua) {

                case 1:
                    bat(array1);
                    break;
                case 2:
                    bi(array1);
                    break;
                case 3:
                    hiru(array1);
                    break;
                case 4:
                    lau(array1);
                    break;
                case 5:
                    bost(array1);
                    break;
                case 6:
                    sei(array1);
                    break;
            }
            System.out.println("Menua");
            System.out.println("1 Sakatuz ikasle baten datuak sartzelko");
            System.out.println("2 Sakatuz ikasle baten datuak jartzeko");
            System.out.println("3 Sakatuz ikasle guztien datuak jartzeko");
            System.out.println("4 Sakatuz nota guztien bataz bestekoa jarriko du");
            System.out.println("5 Sakatuz nota altuena daukan izena eta nota jarriko du");
            System.out.println("6 Sakatuz nota baxuena daukan izena eta nota jarriko du");
            System.out.println("0 Sakatuz ateratzeko");
            menua = sarrera.nextInt();
            }
        }

    public static Gela bat(Gela array1){
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Ikaslearen izena jarri ezazu");
        String izena = sarrera.next();
        System.out.println("Ikaslearean nota jarri ezazu");
        float nota = sarrera.nextFloat();
        array1.beteArray(nota,izena);
        return array1;
    }
    public static void bi(Gela array1){
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Ikaslearen izena jarri ezazu");
        String izena = sarrera.next();
        array1.Mostrar1izena(izena);
    }
    public static void hiru(Gela array1){
        array1.mostrarIzenaNota();
    }
    public static void lau(Gela array1){
        array1.babez();
    }
    public static void bost(Gela array1){
        array1.notaAltuena();
    }
    public static void sei(Gela array1){
        array1.notaBaxuena();
    }


}