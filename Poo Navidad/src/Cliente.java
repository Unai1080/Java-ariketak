public class Cliente {
    private String izena;
    private String dni;
    private boolean socio=false;
    private String tipoDeSocio=null;

    public Cliente(String izena, String dni, boolean socio, String tipoDeSocio){
        this.izena=izena;
        this.dni=dni;
        this.socio=socio;
        if (this.socio){
            if( tipoDeSocio.equals("Premium") || tipoDeSocio.equals("Oro") || tipoDeSocio.equals("Platino")){
                this.tipoDeSocio=tipoDeSocio;
            }
        }
    }
    public Cliente(String izena, String dni){
        this.izena=izena;
        this.dni=dni;
    }
    public double getDecuento(double a){
        if (tipoDeSocio.equals("Premium")){
            a=a-(a*20/100);
        }
        if (tipoDeSocio.equals("Oro")){
            a=a-(a*15/100);
        }
        if (tipoDeSocio.equals("Platino")){
            a=a-(a*10/100);
        }
        return(a);
    }
    public String toString(){
        return "Izena: " +this.izena+
                "\ndni: " +this.dni+
                "\n tipo de socio: " +tipoDeSocio;

    }
}
