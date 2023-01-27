public class Main {
    public static void main(String[] args) {
       int[][] matriz1=new int[5] [5];
       matriz1=matrizMagica(5);
       mostrar(matriz1);
    }
    public static int[][] matrizMagica(int n) {
        int[][] magica = new int[n][n];
        int kont = 1;
        int altura = 0;
        int ancho = n/2;
        while (kont <= (n * n)) {
            if (altura ==-1){
                altura =n-1;
            }
            if (altura == n){
                altura = 0;
            }
            if (ancho == n){
                ancho = 0;
            }
            if (ancho == -1){
                ancho = n-1;
            }
            if(magica[altura][ancho]==0){
                magica[altura][ancho]=kont;
            }else{
                altura=altura+2;
                ancho--;
                if (ancho== -1){
                    ancho=n-1;
                }
                if (ancho== n){
                    ancho=0;
                }
                if (ancho == n){
                    ancho=0;
                }
                if (altura== -1){
                    altura = n-1;
                }
                if (altura== n+1){
                    altura = 1;
                }
                magica[altura][ancho]=kont;
            }
            kont++;
            altura--;
            ancho++;
        }
        return magica;
    }
    public static void mostrar(int[][] a){
        for (int i = 0; i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}
