import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float nota;
        float[] arrayNota = new float[10];
        String[] arrayIzenak = new String[10];
        String[] arrayBalo = new String[10];
        Scanner sarrera = new Scanner(System.in);
        for (int i = 0; i < arrayIzenak.length;i++) {
            System.out.println("Ikaslearen izena jarri: ");
            arrayIzenak[i] = sarrera.next();
            for (int j = 0; j < 1;) {
                System.out.println("Ikaslearen nota jarri: ");
                nota = sarrera.nextFloat();
                if (nota>=0 && nota <=10){
                    arrayNota[i] = nota;
                    j++;
                    if(nota<5){
                        arrayBalo[i]= "Gainditugabe";
                    }
                    else if ((nota>=5) && (nota<7)){
                        arrayBalo[i]= "Ondo";
                    }
                    else if ((nota>=7)&&(nota<9)){
                        arrayBalo[i]= "Oso ondo";
                    }
                    else if ((nota>=9) && (nota<=10)){
                        arrayBalo[i]= "Bikain";
                    }
                }
            }
        }
        for (int i = 0; i < arrayNota.length;i++) {
            System.out.print(arrayNota[i]+ ", ");
            System.out.print(arrayIzenak[i]+ ", ");
            System.out.println(arrayBalo[i]);
        }
    }
}