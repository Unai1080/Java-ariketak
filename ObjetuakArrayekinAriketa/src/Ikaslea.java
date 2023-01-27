public class Ikaslea {
    private String izena;
    private float nota;
    private String notaletraz;

    public Ikaslea(String a, float b) {

        this.izena = a;
        this.nota = b;
        sortunotaLetraz();
    }

    public void sortunotaLetraz(){
        int notaOsoa = (int)this.nota;
        String a="";
        switch (notaOsoa){
            case 0,1,2,3,4: a = "Gainditu gabe";
            case 5,6: a = "Ongi";
            case 7,8: a = "Oso ongi";
            case 9,10: a = "Bikain";
        }
        this.notaletraz=a;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getNotaletraz() {
        return notaletraz;
    }

    public void setNotaletraz(String notaletraz) {
        this.notaletraz = notaletraz;
    }
}
