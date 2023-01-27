public class Produktua {

    private String izena;
    private double balioa;
    private int zenbat;

    public Produktua(String prodIzena, double prodBalioa, int prodZenbat){

        izena=prodIzena;
        balioa=prodBalioa;
        zenbat=prodZenbat;

    }
    public void idatziProduktua (){
        System.out.println("izena= "+izena+ ", balioa= "+balioa+ ", kopurua= "+zenbat);
    }
}
