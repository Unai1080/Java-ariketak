import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sarrera= new Scanner(System.in);

        System.out.println("X1-aren koordenatua jarri ezazu: ");
        int x1=sarrera.nextInt();
        System.out.println("Y1-aren koordenatua jarri ezazu: ");
        int y1=sarrera.nextInt();
        Punto dot1= new Punto(x1,y1);
        System.out.println("X2-aren koordenatua jarri ezazu: ");
        int x2=sarrera.nextInt();
        System.out.println("Y2-aren koordenatua jarri ezazu: ");
        int y2=sarrera.nextInt();
        Punto dot2= new Punto(x2,y2);
        System.out.println("Zabalera jarri ezazu: ");
        int ancho=sarrera.nextInt();

        Recta recta1 = new Recta(ancho,dot1, dot2);

        System.out.println("X1-aren koordenatua jarri ezazu: ");
        x1=sarrera.nextInt();
        System.out.println("Y1-aren koordenatua jarri ezazu: ");
        y1=sarrera.nextInt();
        Punto dot3=  new Punto(x1,y1);
        System.out.println("X2-aren koordenatua jarri ezazu: ");
        x2=sarrera.nextInt();
        System.out.println("Y2-aren koordenatua jarri ezazu: ");
        y2=sarrera.nextInt();
        Punto dot4= new Punto(x2,y2);
        System.out.println("Zabalera jarri ezazu: ");
        ancho=sarrera.nextInt();

        Recta recta2 = new Recta(ancho,dot3, dot4);
        Recta recta3=recta1.masLargo(recta2);
        recta3.Muestra2();
    }
}