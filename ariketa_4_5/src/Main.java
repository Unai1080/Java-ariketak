import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sarrera = new Scanner(System.in);
        float N;
        System.out.println("Zure nota idatzi ezazu: ");
        N = sarrera.nextFloat();
        nota(N);
    }

    public static void nota(float a){
        if (a<5 && a>0) {
            System.out.println("Gainditu gabe");
        }
            else if (a>5 && a<7) {
                System.out.println("Ondo");
            }
                else if (a>7 && a<9) {
                    System.out.println("Oso ondo");
                }
                    else if (a<=10 && a>9) {
                        System.out.println("Bikain");
                    }else {
                        System.out.println("Gaizki sartu duzu zenbakia");
                    }


        }



    }



