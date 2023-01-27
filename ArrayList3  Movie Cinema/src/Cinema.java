import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {
    private String izena;
    private List<Movie> peliculas;
    private Movie[] salas;

    public Cinema (String izena, int numSalas){
        this.izena=izena;
        this.peliculas= new ArrayList<Movie>();
        this.salas = new Movie[numSalas];
    }
    public boolean addMovie(Movie pelicula){
        if (!this.peliculas.contains(pelicula)){
            this.peliculas.add(pelicula);
        }else{
            System.out.println("Pelikula hori existitzen da");
        }

        boolean sartuta=false;
        for (int i = 0; i < this.salas.length && !sartuta; i++) {
            if (this.salas[i]==null){
                this.salas[i]=pelicula;
                System.out.println("Sartuta");
                sartuta=true;
            }
        }
        if (!sartuta){
            System.out.println("Sala guztiak okupatuta daude");
        }
        return sartuta;
    }
    public boolean addMovie(Movie pelicula, int sala){
        boolean sartuta=false;
        if (!this.peliculas.contains(pelicula)){
            this.peliculas.add(pelicula);
        }else{
            System.out.println("Pelikula hori existitzen da");
        }
        if (this.salas[sala]==null){
            this.salas[sala]=pelicula;
            System.out.println("Sartuta");
            sartuta=true;
        }else{
            System.out.println("Sala hori okupatuta dago");
        }
        return sartuta;
    }
    public int roomOfMovie(String titulo, int duracion , int año){
        Movie pelicula=new Movie(titulo,duracion,año);
        int kont=0;
        boolean salir=false;
        while(kont<this.salas.length && !salir){
            if (this.salas[kont]!=null) {
                if(this.salas[kont].isEqual(pelicula)){
                    salir=true;
                }
            }
            kont++;
            }
        if (kont==this.salas.length && !salir){
            System.out.println("Ez dago pelikula ");
            kont++;
        }
        kont--;
        return kont;
    }
    public void display(){
        System.out.println("Zinemaren izena: "+this.izena);
        System.out.println();
        for (Movie peliculas: this.peliculas){
            System.out.println("Pelikula datuak:");
            System.out.println(peliculas.toString());
            System.out.print("Sala: ");
            int sala=roomOfMovie(peliculas.getTitulo(),peliculas.getDuracion(),peliculas.getAño());
            if (sala!=this.salas.length){
                System.out.println(sala);
            }
            System.out.println();
        }
    }
    public void removeMovie(String titulo){
        Movie pelicula= new Movie(titulo,0,0);
        int sala;
        for (Movie peliculas: this.peliculas){
            if (peliculas.isEqual(pelicula)){
                this.peliculas.remove(pelicula);
                for (int i = 0; i < this.salas.length; i++) {
                    if(salas[i]!=null ){
                        if(salas[i].isEqual(pelicula)){
                            salas[i]=null;
                        }
                    }
                }
            }
        }
    }
    public List<Integer> freeRooms(){
        List<Integer> array =new ArrayList<Integer>();
        for (int i = 0; i < this.salas.length; i++) {
            if(salas[i]==null){
                array.add(i);
            }
        }
        return(array);
    }
    public void changeRooms(Movie pelicula){
        Scanner sarrera = new Scanner(System.in);
        int sala = roomOfMovie(pelicula.getTitulo(),pelicula.getDuracion(),pelicula.getAño());
        if (sala!=this.salas.length-1){
            System.out.println(sala+" salan dago pelikula ");
            this.salas[sala]=null;
            System.out.println("Zer salan sartu nahi duzu pelikula?");
            int n= sarrera.nextInt();
            while (n<this.salas.length & n>=0 & !addMovie(pelicula,n)){
                System.out.println("Sala hori okupatuta dago, beste bat sartu:");
                n= sarrera.nextInt();
            }
        }else{
            System.out.println("Pelikula hori ez dago");
        }
    }
    public void resetCinema(){
        this.peliculas.clear();
        for (int i = 0; i < this.salas.length; i++) {
            this.salas[i]=null;
        }
    }
    public List <String> moviesShorterThan(int duracion){
        List <String> peliculasShort = new ArrayList<String>();
        for (Movie peliculas: this.peliculas){
            if (peliculas.getDuracion()<duracion){
                peliculasShort.add(peliculas.getTitulo());
            }
        }
        return peliculasShort;
    }
    public List <String> moviesShorterThan(int horas, int minutos){
        int duracion= horas*60+minutos;
        List <String> peliculasShort = new ArrayList<String>();
        for (Movie peliculas: this.peliculas){
            if (peliculas.getDuracion()<duracion){
                peliculasShort.add(peliculas.getTitulo());
            }
        }
        return peliculasShort;
    }

}
