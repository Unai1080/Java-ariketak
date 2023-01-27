public class Main {
    public static void main(String[] args) {
        int suma=0;
        int[] arrayZenb = new int[100];
        for (int i = 0; i < arrayZenb.length; i++) {
            arrayZenb[i] = i+1;
            suma=suma+arrayZenb[i];
        }
        System.out.println("Arrayaren gehiketa: "+suma);
        System.out.println("Arrayaren bataz bestekoa: "+suma/100);
    }
}