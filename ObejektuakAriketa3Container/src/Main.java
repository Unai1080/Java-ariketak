import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringContainer obj =new StringContainer("hola como estas");
        StringContainer obj1 =new StringContainer("Mi primerita vez");
        //System.out.println(obj.shiftRight(4, '-'));
        //System.out.println(obj.shiftLeft(4, '-'));
        //obj.rotate(2, 'R');
        //obj.rotate(2, 'L');
        //obj.encoding(3);
        System.out.println(obj1.mixWords(obj1,obj));
    }

}