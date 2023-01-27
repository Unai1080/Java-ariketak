public class StringContainer {

    private String izena;
    private int kont;

    public StringContainer(String izena) {
        this.izena = izena;
    }

    @Override
    public String toString() {
        return this.izena + kont;
    }

    public boolean isEqualTo(String bi) {
        return this.izena.equals(bi);
    }

    public String shiftRight(int zenb, char letra) {
        String berria;
        berria = izena.substring(zenb, izena.length());

        for (int i = 0; i < zenb; i++) {
            berria = berria + letra;
        }
        return berria;
    }

    public String shiftLeft(int zenb, char letra) {
        String berria;
        berria = izena.substring(0, izena.length() - zenb);

        for (int i = 0; i < zenb; i++) {
            berria = letra + berria;
        }
        return berria;
    }

    public void rotate(int zenb, char letra) {
        String berria = "";

        if (letra == 'L') {
            berria = izena.substring(0, izena.length() - zenb);
            berria = izena.substring(izena.length() - zenb) + " " + berria;
        } else if (letra == 'R') {
            berria = izena.substring(zenb);
            berria = berria + " " + izena.substring(0, zenb);
        }
        System.out.println(berria);
    }

    public void encoding(int zenb) {
        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        char berria = ' ';
        String berria3 = "";
        int k = 0;

        for (int i = 0; i < izena.length(); i++) {
            for (int j = 0; j < abecedario.length(); j++) {
                if (izena.charAt(i) == abecedario.charAt(j)) {
                    if (i % 2 == 0) {
                        if ((j + zenb) > 26) {
                            k = j;
                            j = (j + zenb) - 26;
                            berria = abecedario.charAt(j -1);
                            j = k;
                        } else {
                            berria = abecedario.charAt(j + zenb);
                        }
                    }

                    else {
                        if ((j - zenb) < 0) {
                            k = j;
                            j = (j - zenb) + 26;
                            berria = abecedario.charAt(j +1);
                            j = k;
                        }
                        else {
                            berria = abecedario.charAt(j - zenb);
                        }
                    }
                    berria3 = berria3 + berria;

                }
            }

        }
        System.out.println(berria3);
    }
    public String mixWords(StringContainer a, StringContainer b){
        String c="";
        int kont1=0;
        int kont2=0;
        boolean container1=false;
        boolean container2=false;
        while(container1 == false && container2==false){
            while (kont1<a.izena.length() && a.izena.charAt(kont1) != ' '){
                c=c+a.izena.charAt(kont1);
                if (kont1== a.izena.length()-1){
                    container1=true;
                }
                kont1++;
            }
            kont1++;
            while (kont2<b.izena.length() && b.izena.charAt(kont2)!= ' ' ){
                c=c+b.izena.charAt(kont2);
                if (kont1== b.izena.length()-1){
                    container2=true;
                }
                kont2++;
            }
            kont2++;
        }
        return c;
    }
}
