import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int zenbakia;
        int [] arrayZenb= new int[10];
        Scanner sarrera=new Scanner(System.in);
        for(int i=0; i< arrayZenb.length;i++){
            System.out.println("Sartu zenbaki bat: ");
            zenbakia= sarrera.nextInt();
            arrayZenb[i]=zenbakia;
        }
        for(int j=0; j < arrayZenb.length; j++){
            System.out.println(j+". gelatxoan daoen balorea da: "+arrayZenb[j]);
        }
    }
}