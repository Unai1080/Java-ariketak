import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int luzera;
        System.out.println("Zenbat luzeerako array-a nahi duzu");
        Scanner sarrera = new Scanner(System.in);
        luzera= sarrera.nextInt();
        int[] array1= new int[luzera];
        array1=sortuArray(luzera);
        System.out.println("Zure array-a desordenatuta: ");
        idatzi(array1);
        array1=ordenatu(array1);
        System.out.println("Zure array-a ordenatuta: ");
        idatzi(array1);

    }
    public static int ausazko2 (int min, int max){
        int zenbAusazkoa=(int)Math.floor(Math.random() * (max-min+1))+ min;
        return zenbAusazkoa;
    }

    public static int[] sortuArray(int a){
        int[] array1 = new int[a];
        final int min=25;
        final int max=100;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ausazko2(min,max);
        }
        return array1;
    }

    public static void idatzi(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("");
    }

    public static int[] ordenatu(int[] desordenado){
        int maximoa;
        for (int i=0;  i < desordenado.length;) {
            for (int j=i+1;  j < desordenado.length;j++) {
                if (desordenado[i]<desordenado[j]) {
                    maximoa=desordenado[j];
                    desordenado[j]=desordenado[i];
                    desordenado[i]=maximoa;
                }
            }
            i++;

        }
        return(desordenado);
    }
}

