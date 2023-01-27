public class Dice {
    private int lastry=0;
    private int tryes=0;

    public Dice(){}

    public void play(){
        this.lastry=(int)Math.floor(Math.random()*6+1);
        tryes=tryes+1;
    }
    public void show(){
        System.out.println("Zure azken saiakeran: "+this.lastry);
        System.out.println("Saiakera kopurua: "+this.tryes);
    }
    public int getLasyTry(){
        return this.lastry;
    }

}


