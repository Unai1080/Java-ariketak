public class Player {
    private String izena;
    private Dice dado;
    public static int totalplayers;

    public Player(String a, Dice b){
        this.izena=a;
        this.dado=b;
        this.totalplayers++;
    }

    public void bota(){
        dado.play();
    }
    public void erakutsi(){
        dado.show();
    }
    public void show(){
        System.out.println("Zure izena:"+this.izena);
        dado.show();
        System.out.println("Jokalari kopurua: "+this.totalplayers);
    }
    public int showTotalPlayers(){
        return(this.totalplayers);
    }
    public String getIzena(){
        return this.izena;
    }
    public Dice getDadoa(){
        return (this.dado);
    }
}
