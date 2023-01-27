import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> arraylist= new ArrayList <Integer> ();
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Sartu n zenbakia");
        int n = sarrera.nextInt();
        int kont=1;
        //Carga el Arraylist con los primeros 10 divisroes de n
        for (int i = 1; kont<=10 && i<=n ;i++ ){
            if (n%i==0) {
                arraylist.add(i);
                kont++;
            }
        }

        mostrar(arraylist);
        arraylist=elminiar(arraylist);

        //Carga el Arraylist con 20 numero aleatorios entre -100 y 100
        int aleatorio;
        for (int i = 0; i<20;i++){
            aleatorio=(int)(Math.random()*(101- -101)-101);
            arraylist.add(aleatorio);
        }
        mostrar(arraylist);
        arraylist=elminiar(arraylist);

        int n1;
        for (int i = 0; i<20;){
            n1=(int)(Math.random()*(21- -21)-21);
            if (!arraylist.contains(n1)){
                arraylist.add(n1);
                i++;
            }
        }
        mostrar(arraylist);
    }

    //Borra todos los elementos de la Arraylist
    public static List <Integer> elminiar(List <Integer> arraylist){
        arraylist.clear();
        return arraylist;
    }


    //Muestra los elemtos de la Arraylist
    public static void mostrar(List <Integer> arraylist) {
        for(int i=0; i<arraylist.size();i++){
            System.out.print(arraylist.get(i)+" ");
        }
        System.out.println();
        }
    }

}
