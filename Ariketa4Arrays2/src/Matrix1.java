import java.util.Scanner;

public class Matrix1 {
    private int[] [] matriz;
    final private int nr=10;
    final private int nc=15;

    public Matrix1(){
        this.matriz= new int[nr][nc];
    }

    public Matrix1(int a, int b){
        if (a<10 && b<15){
            this.matriz= new int[a][b];
        }else{
            this.matriz= new int[nr][nc];
        }
    }

    public void loadByRows(){
        Scanner sarrera= new Scanner(System.in);
        int a=1;
        for (int i=0; i < this.matriz.length && a!=0; i++){
            for (int j=0; j <this.matriz[i].length && a!=0; j++){
                if (this.matriz[i][j]==0){
                    System.out.println("Zenbaki bat sartu ezazu ( 0 ateratzeko: ");
                    a=sarrera.nextInt();
                    this.matriz[i][j]=a;
                }
            }
        }
    }

    public void loadByColumns(){
        Scanner sarrera= new Scanner(System.in);
        int a=1;
        for (int i=0; i < this.matriz[0].length && a!=0; i++){
            for (int j=0; j <this.matriz.length && a!=0; j++){
                if (this.matriz[j][i]==0){
                    System.out.println("Zenbaki bat sartu ezazu ( 0 ateratzeko: ");
                    a=sarrera.nextInt();
                    this.matriz[j][i]=a;
                }
            }
        }
    }
    public void display(){
        for (int i=0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                System.out.print(this.matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void reverseRows(){
        int kont2;
        int tartekoa;
        for (int i=0; i < this.matriz.length; i++) {
            kont2=this.matriz[i].length-1;
            for (int j = 0; j < this.matriz[i].length && kont2>j; j++) {
                tartekoa=this.matriz[i][j];
                this.matriz[i][j]=this.matriz[i][kont2];
                this.matriz[i][kont2]=tartekoa;
                kont2--;
            }
        }
    }
    public void swapRows(int a, int b){

    }
}
