public class Main {
    public static void main(String[] args) {
        int[] arrayZbk = new int[5];
        int[] arrayZbk2 = new int[5];
        for (int i = 0; i < arrayZbk.length; i++) {
            arrayZbk[i] = i + 1;
        }
        int j = arrayZbk.length-1;
        for (int i = 0; i < arrayZbk.length; i++) {
            arrayZbk2[j]=arrayZbk[i];
            j--;
        }
        for (int i = 0; i < arrayZbk.length; i++) {
             System.out.print(arrayZbk2[i]+", ");
        }
    }
}

