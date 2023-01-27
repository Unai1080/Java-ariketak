import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num1;
        Scanner sarrera= new Scanner(System.in);
        NumberStatistics array1 = new NumberStatistics();
        System.out.println("Zenbaki bat sartu ezazu");
        num1= sarrera.nextInt();
        while (num1!=0){
           array1.addNumber(num1);
           System.out.println("Zenbaki bat sartu ezazu");
           num1= sarrera.nextInt();
        }
        System.out.println("Zure array-aren zbk kopurua: "+array1.amountOfNumbers());
        System.out.println("Zure array-aren bataz bestekoa: "+array1.showStatistics());
    }
}