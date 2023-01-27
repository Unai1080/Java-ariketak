import java.util.List;

public class Test {
    public static void main(String[] args) {
        Movie peli1=new Movie("Titanic", 250,1999);
        Movie peli2=new Movie("Polar Express", 200,2005);
        Movie peli3=new Movie("Iron Man", 190,2006);
        Movie peli4=new Movie("Spider Man", 130,2000);
        Movie peli5=new Movie("Lucy", 150,2018);
        Cinema cinesa= new Cinema("Cinesa Urbil",5);
        cinesa.addMovie(peli1,0);
        cinesa.addMovie(peli2,1);
        cinesa.addMovie(peli3,2);
        cinesa.addMovie(peli4,3);
        cinesa.addMovie(peli5);
        System.out.println("Sala de la pelicula Polar Express");
        System.out.println(cinesa.roomOfMovie("Polar Express",200,2005));
        cinesa.display();
        cinesa.removeMovie("Iron Man");
        cinesa.display();
        cinesa.removeMovie("Titanic");
        cinesa.removeMovie("Lucy");
        cinesa.display();
        System.out.println("Sala libreak: ");
        List <Integer> arraylist = cinesa.freeRooms();
        for (Integer i: arraylist){
            System.out.print(i+" ");
        }
        System.out.println();
        cinesa.changeRooms(peli2);
        cinesa.display();
        cinesa.resetCinema();
        cinesa.display();
        cinesa.addMovie(peli1,0);
        cinesa.addMovie(peli2,1);
        cinesa.addMovie(peli3,2);
        cinesa.addMovie(peli4,3);
        cinesa.addMovie(peli5);
        System.out.println("Peliculas < 180 minutos");
        List <String> peliculasShort = cinesa.moviesShorterThan(180);
        for(String peli: peliculasShort){
            System.out.print(peli+" ");
        }
        System.out.println();
        System.out.println("Peliculas < 150 minutos");
        List <String> peliculasShort2 = cinesa.moviesShorterThan(2,30);
        for(String peli: peliculasShort2){
            System.out.print(peli+" ");
        }
    }
}
