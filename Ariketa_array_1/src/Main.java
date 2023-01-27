import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int n,m;
        System.out.println("Zenbat altura array-a nahi duzu");
        Scanner sarrera = new Scanner(System.in);
        n= sarrera.nextInt();
        System.out.println("Zenbat zabalera array-a nahi duzu");
        m= sarrera.nextInt();
        int[][] array1= new int[n][m];
        array1= sortuArray(n,m);
        System.out.println("Zure array-a desordenatuta: ");
        idatzi(array1);

    }
    public static int[][] sortuArray(int a, int b){
        int[][] array1 = new int[a][b];
        final int min=25;
        final int max=100;
        for (int i = 0; i < array1.length; i++) {
            for (int j=0; j < array1[i].length; j++){
                array1[i][j] = i+j;
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
}