public class Main {

    public static void main(String[] args) {
        int N;
        N=0;
        while (N<11){
            System.out.println(N);
            tabla(N);
            N++;
        }


    }

    public static void tabla(int a){
        int kont;
        kont=0;
        while (kont<11){
            System.out.println(a+" X "+kont+" = "+a*kont);
            kont++;
        }


    }


}
