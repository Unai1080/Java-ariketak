import java.util.Locale;

public class Movie {
    private String titulo;
    private int duracion;
    private int año;

    public Movie( String titulo, int duracion, int año){
        this.titulo=titulo;
        this.duracion=duracion;
        this.año=año;
    }
    public String toString(){
        return "Titulo: "+this.titulo+" , Duracion en minutos: "+this.duracion+" , Año: "+año;
    }
    public boolean isEqual(Movie a){
        boolean iguales=false;
        if (this.titulo.toLowerCase().equals(a.titulo.toLowerCase())){
            iguales=true;
        }
        if (this.año==a.año){
            iguales=true;
        }
        if (this.duracion+a.duracion>=-5 && this.duracion+a.duracion<=5){
            iguales=true;
        }
        return iguales;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getAño() {
        return año;
    }
}
