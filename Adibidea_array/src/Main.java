import java.util.Random;

public class Main{
    public static void main(String[] args) {
        final int zenbaki_haundiena = 100;
        int zbk;
        int[] arrayzenbaki = new int[100];
        for (int i = 0; i < arrayzenbaki.length; i++) {
            arrayzenbaki[i] = ausazkoa(zenbaki_haundiena);
        }
        for (int i = 0; i < arrayzenbaki.length; i++) {
            System.out.print(arrayzenbaki[i] + ", ");
        }
        System.out.println(" ");
        zbk = arraykoHaundiena(arrayzenbaki);
        System.out.println("Arrayko zenbaki haundiena: " +zbk+" da.");
    }
    public static int ausazkoa(int a) {
        Random r=new Random();
        return r.nextInt(a);
    }
    public static int arraykoHaundiena( int [] arrayhaundiena){
        int haundia=0;
        for (int i = 0; i < arrayhaundiena.length;i++) {
            haundia= haundiena(haundia,arrayhaundiena[i]);
        }
        return (haundia);
    }
    public static int haundiena(int a, int b){
        if (a>b) {
            return (a);
        }else{
            return(b);
        }
    }
}