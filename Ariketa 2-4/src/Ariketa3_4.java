import java.util.Scanner;

public class Ariketa3_4 {
    public static void main(String[] args) {
        Scanner sarrera = new Scanner(System.in);
        int zbk1, zbk2, emaitza;
        int erantzuna;
        erantzuna = 0;
        while (erantzuna==0){
            System.out.println("Idatzi itzazu bi zenbaki : ");
            zbk1= sarrera.nextInt();
            zbk2= sarrera.nextInt();
            emaitza=1;
            while (zbk2!=0){
                emaitza=emaitza*zbk1;
                zbk2--;
            }
            System.out.println("Zure emaitza hau da: "+emaitza);
            System.out.println("Jarraitu nahi duzu? 0=bai eta beste edozein zenbaki= ez");
            erantzuna= sarrera.nextInt();
        }

    }
}
