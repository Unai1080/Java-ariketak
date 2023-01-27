public class Main {
    public static void main(String[] args) {
        Dice bat1=new Dice();
        Player bat= new Player("Unai", bat1);
        Dice bi2=new Dice();
        Player bi= new Player("Ander", bi2);
        Dice hiru3=new Dice();
        Player hiru= new Player("Ekaitz", hiru3);
        int kont1=losFor2(bat);
        int kont2=losFor2(bi);
        int kont3=losFor2(hiru);
        int sum1=losFor1(bat);
        int sum2=losFor1(bi);
        int sum3=losFor1(hiru);
        String irabazlea= sumatorios(sum1,sum2,sum3,bat, bi, hiru);
        String irabazlea2=kontadores(kont1,kont2,kont3, bat, bi, hiru);
        System.out.println("Puntuazio gehiena daukan pertsona: "+irabazlea);
        System.out.println("6 gehiena atera dituen pertsona: "+irabazlea2);
    }
    public static int losFor1 (Player a) {
        int sum = 0;
        for (int i = 0; i < 50; i++) {
            a.bota();
            sum = sum + a.getDadoa().getLasyTry();
        }
        return sum;
    }
    public static int losFor2 (Player a){
        int kont=0;
        for (int i=0; i<50; i++) {
            a.bota();
            if (a.getDadoa().getLasyTry() == 6) {
                kont++;
            }
        }
        return kont;
    }
    public static String sumatorios(int sum1,int sum2,int sum3,Player bat, Player bi,Player hiru){
        String irabazlea="";
        if (sum1>=sum2 && sum1>=sum3){
            irabazlea=bat.getIzena();
        }
        if (sum2>=sum1 && sum2>=sum3){
            irabazlea=bi.getIzena();
        }
        if (sum3>=sum1 && sum3>=sum2){
            irabazlea=hiru.getIzena();
        }
        return irabazlea;
    }
    public static String kontadores(int kont1,int kont2,int kont3,Player bat, Player bi,Player hiru){
        String irabazlea2="";
        if (kont1>=kont2 && kont1>=kont2){
            irabazlea2=bat.getIzena();
        }
        if (kont2>=kont1 && kont2>=kont3){
            irabazlea2=bi.getIzena();
        }
        if (kont3>=kont1 && kont3>=kont2){
            irabazlea2=hiru.getIzena();
        }
        return irabazlea2;
    }
}