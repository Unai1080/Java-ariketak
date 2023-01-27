import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int n,m;
        boolean berdinak;
        System.out.println("Zenbat altura array-a nahi duzu");
        Scanner sarrera = new Scanner(System.in);
        n= sarrera.nextInt();
        System.out.println("Zenbat zabalera array-a nahi duzu");
        m= sarrera.nextInt();
        int[][] array1= new int[n][m];
        array1= sortuArray(n,m);
        System.out.println("Zure array-a: ");
        idatzi(array1);
        berdinak=(berdina2(array1));
        System.out.println("Zure arraya berdina da? "+ berdinak);
    }
    public static int ausazko2 (int min, int max){
        int zenbAusazkoa=(int)Math.floor(Math.random() * (max-min+1))+ min;
        return zenbAusazkoa;
    }

    public static int[][] sortuArray(int a, int b){
        int[][] array1 = new int[a][b];
        final int min=0;
        final int max=1;
        for (int i = 0; i < array1.length; i++) {
            for (int j=0; j < array1[i].length; j++){
                array1[i][j] = ausazko2(min,max);
            }
        }
        return array1;
    }

    public static void idatzi(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j=0; j < a[i].length; j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static boolean berdina2 (int[][] a){
        boolean berdinak=true;
        for (int i = 0; i < a.length && berdinak==true; i++) {
            for (int j=0; j < a[i].length && berdinak==true; j++){
                berdinak=berdina((a[i][j]),(a[j][i]));
            }
        }
        return  berdinak;
    }

    public static boolean berdina (int a, int b){
        boolean berdinak=false;
        if (a==b){
            berdinak=true;
        }
        return (berdinak);
    }
}