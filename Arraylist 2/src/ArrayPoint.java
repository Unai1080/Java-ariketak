import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class ArrayPoint {
    List<Point> arraylist;

    public ArrayPoint(){
        Scanner sarrera = new Scanner(System.in);
        this.arraylist= new ArrayList <Point> ();
        System.out.println("Zenbat puntu jarri nahi dituzu?");
        int puntos= sarrera.nextInt();
        int x;
        int y;
        for (int i=0; i<puntos;i++){
            System.out.println("X ren balioa");
            x=sarrera.nextInt();
            System.out.println("Y ren balioa");
            y=sarrera.nextInt();
            Point punto= new Point(x,y);
            arraylist.add(punto);
        }
    }
    public ArrayPoint(List<Point> arraylist){
        this.arraylist=arraylist;
    }
    public void mostrar(){
        for (Point punto: this.arraylist){
            System.out.print(punto.toString());
            System.out.println();
        }
    }
    public List<Point> inverso(){
        List<Point> inverso = new ArrayList<Point>();
        Point punto;
        for (int i=this.arraylist.size()-1; i>-0;i--){
            punto=this.arraylist.get(i);
            inverso.add(punto);
        }
        return inverso;
    }
    public Point segundoCuadrante(){
        Point segundo= new Point(0,0);
        boolean encontrado=false;
        for (Point punto: this.arraylist){
            if(punto.getX()<0 && punto.getY()>0&& !encontrado) {
                segundo = punto;
                encontrado=true;
            }
        }
        return(segundo);
    }
    public int zero(){
        int kont=0;
        int kont2=0;
        for (Point punto: this.arraylist){
            if(punto.getX()==0 && punto.getY()==0) {
                kont2=kont;
            }
            kont++;
        }
        return kont2;
    }
    public boolean unos(){
        boolean esta= false;
        for (Point punto: this.arraylist){
            if(punto.getX()==1 && punto.getY()==1) {
                esta = true;
            }
        }
        return esta;
    }
    public void diezEliminar(){
        for (Point punto: this.arraylist){
            if(Math.sqrt((0-punto.getX())^2 + (0- punto.getY())^2)<10) {
                arraylist.remove(punto);
                break;
            }
        }
    }
    public void cuartoCuadrante(){
        for (Point punto: this.arraylist){
            if(punto.getX()>0 && punto.getY()<0) {
                arraylist.remove(punto);
            }
        }
    }
}
