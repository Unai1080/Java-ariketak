import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Zbk, Zbk2, emaitza;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Zenbaki bat sartu ezazu: ");
        Zbk = sarrera.nextInt();
        System.out.println("Beste zenbaki bat sartu ezazu: ");
        Zbk2 = sarrera.nextInt();
        emaitza=zatitzailekomuna(Zbk,Zbk2);
        System.out.println("Bi zenbakien arteko zatitzaile komun handiena: "+emaitza);
    }
    public static int zatitzailekomuna(int a, int b){
        int emaitza =0;
        int menor;
        if (a>b){
            menor=a;
        }else{
            menor=b;
        }
            for (int i=1; i<=menor; i++){
                if ((a % i==0) && (b % i==0)){
                    emaitza=i;
                }
            }
        return emaitza;
    }
}