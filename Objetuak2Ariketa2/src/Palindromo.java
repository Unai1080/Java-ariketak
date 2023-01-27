public class Palindromo {

    private long num;

    public Palindromo(long a){
        this.num=a;
    }
    public Palindromo(){}

    public boolean esPalindromo(){
        boolean pali = true;
        long max=contarCifras();
        long min=1;
        while (max>min){
            if (digiPosN(max)!=digiPosN(min)){
                pali=false;
            }
            max--;
            min++;
        }
        return (pali);
    }
    public long contarCifras(){
        long cifras=1;
        long num1= this.num;
        while (num1/10 >= 1){
            num1=num1/10;
            cifras++;
        }
        return (cifras);
    }
    public long digiPosN(long pos){
        long num1= this.num;
        long posnum = num1 % 10;
        for (int i=1; i<=pos; i++){
            posnum = num1 % 10;
            num1= num1/10;
        }
        return (posnum);
    }

}
