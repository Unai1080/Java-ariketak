import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Zbk,Zbk2;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Zenbaki bat sartu ezazu: ");
        Zbk = sarrera.nextInt();
        Zbk2=Zbk;
        for (int i=2; i<Zbk;i++){
            while (Zbk%i==0){
                Zbk=Zbk/i;
                System.out.print(i+" * ");
            }
        }
        System.out.println("= "+Zbk2);
    }

}
