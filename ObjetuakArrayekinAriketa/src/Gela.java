

public class Gela {

    private Ikaslea[] g1;

    public Gela(){
        this.g1= new Ikaslea[20];
    }

    public void beteArray(float a, String nombre){
        Ikaslea c = new Ikaslea(nombre,a);
        boolean sartuta=false;
        for (int i=0; i<this.g1.length && sartuta==false;i++){
            if (this.g1[i]==null){
                this.g1[i]= c;
                sartuta=true;
            }
        }
    }

    public void mostrarIzenaNota() {
        for (int i = 0; i < this.g1.length; i++) {
            if (this.g1[i] != null) {
                System.out.println("Zure izena: "+this.g1[i].getIzena());
                System.out.println("Zure nota: "+this.g1[i].getNotaletraz());
            }
        }
    }

    public void Mostrar1izena(String a) {
        for (int i = 0; i < this.g1.length; i++) {
            if (this.g1[i] != null) {
                if (this.g1[i].getIzena().equals(a)) {
                    System.out.println("Zure izena: " + this.g1[i].getIzena());
                    System.out.println("Zure nota: " + this.g1[i].getNotaletraz());
                }
            }
        }
    }
    public void babez(){
        float gehiketa=0;
        int kont=0;
        for (int i = 0; i < this.g1.length; i++) {
            if (this.g1[i] != null) {
                gehiketa= this.g1[i].getNota() + gehiketa;
                kont++;
            }
        }
        System.out.println("Noten bataz bestekoa: "+gehiketa/kont);
    }
    public void notaAltuena(){
        float altuena=0;
        String nombre="ez daude ikaslerik sartuta";
        for (int i = 0; i < this.g1.length; i++) {
            if (this.g1[i] != null) {
                if (altuena<this.g1[i].getNota()){
                    altuena=this.g1[i].getNota();
                    nombre=this.g1[i].getIzena();
                }
            }
        }
        System.out.println("Ikaslearen nota altuena: "+altuena+ " eta bere izena: "+nombre);
    }
    public void notaBaxuena(){
        float baxuena=10;
        String nombre="ez daude ikaslerik sartuta";
        for (int i = 0; i < this.g1.length; i++) {
            if (this.g1[i] != null) {
                if (baxuena>this.g1[i].getNota()){
                    baxuena=this.g1[i].getNota();
                    nombre=this.g1[i].getIzena();
                }
            }
        }
        System.out.println("Ikaslearen nota baxuena: "+baxuena+ " eta bere izena: "+nombre);
    }



}
