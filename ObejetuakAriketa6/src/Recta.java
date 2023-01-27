public class Recta {
    private int ancho;
    private Punto dot1;
    private Punto dot2;

    public Recta(int a, Punto b, Punto c){
        ancho=a;
        dot1=b;
        dot2=c;

    }

    public Recta(int a, int x1, int y1, int x2, int y2){
        Punto dot1= new Punto(x1,y1);
        Punto dot2= new Punto(x2,y2);
        ancho=a;
        this.dot1= dot1;
        this.dot2= dot2;
    }

    public boolean esHorizontal(){
        boolean horizontal=false;
            if (dot1.getY()== dot2.getY()){
                horizontal=true;
            }
        return(horizontal);
    }
    public boolean esVertical() {
        boolean vertical = false;
        if (dot1.getX() == dot2.getX()) {
            vertical = true;
        }
        return (vertical);
    }
    public int puntoAlto(){
        int alto;
        if (dot1.getY() > dot2.getY()){
            alto=dot1.getY();
        }else{
            alto=dot2.getY();
        }
        return(alto);
    }
    public double longitud(){
        int a= dot1.getY()-dot2.getY();
        int b= dot2.getX()-dot2.getX();
        double emaitza = Math.sqrt((a*a)+(b*b));
        return (emaitza);
    }

    public Recta masLargo(Recta a) {
        Recta handiena = new Recta(this.ancho, this.dot1, this.dot2);
        if (a.longitud() > this.longitud()) {
            handiena = a;
        }
        return (handiena);
    }
        public void Muestra2() {
            System.out.println("Zure zabalera: " + this.ancho);
            this.dot1.Muestra();
            this.dot2.Muestra();
        }


}
