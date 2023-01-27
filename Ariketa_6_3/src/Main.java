import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int zenbakia;
        char laletra;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Zure DNI-a jarri ezazu: ");
        zenbakia= sarrera.nextInt();
        laletra=letra(zenbakia%23);
        System.out.println("Zure DNI-a hau da: "+zenbakia+laletra);
    }
    public static char letra(int a){
        char [] arrayChar= new char[] {'T', 'R', 'W', 'A' , 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return(arrayChar[a]);
    }
}