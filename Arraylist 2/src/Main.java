import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayPoint arraypoint= new ArrayPoint();
        arraypoint.mostrar();
        List<Point> arraylist=arraypoint.inverso();
        ArrayPoint arraypoint2= new ArrayPoint(arraylist);
        System.out.println("Inversa");
        Point punto = arraypoint.segundoCuadrante();
        System.out.println(punto.toString());
        arraypoint2.mostrar();
        int zero =arraypoint.zero();
        System.out.println(zero + " Posizioan dago (0,0) puntua");
        if (arraypoint.unos()){
            System.out.println("Esta (1,1)");
        }else{
            System.out.println("No esta (1,1)");
        }

        arraypoint.diezEliminar();
        System.out.println("Despues de 10 eliminar");
        arraypoint.mostrar();

        arraypoint.cuartoCuadrante();
        System.out.println("Despues de eliminar todos los del cuarto caudrante");
        arraypoint.mostrar();

    }
}