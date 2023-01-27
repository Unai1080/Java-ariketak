import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Zbk, Zbk2, emaitza, hondarra, emaitza2, hondarra2;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Zenbaki bat sartu ezazu: ");
        Zbk = sarrera.nextInt();
        System.out.println("Beste zenbaki bat sartu ezazu: ");
        Zbk2 = sarrera.nextInt();
        emaitza=Zbk;
        hondarra=Zbk2;
        hondarra2=1;
        while (hondarra2!=0){
            emaitza2=emaitza % hondarra;
            hondarra2=emaitza2;
            emaitza=hondarra;
            hondarra=emaitza2;
        }
        System.out.println("Euclides ("+Zbk+ ", "+Zbk2+ ") = "+emaitza);

    }

}