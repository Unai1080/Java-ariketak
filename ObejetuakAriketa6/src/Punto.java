public class Punto {

    private int x;
    private int y;

    public Punto(int a, int b){

        x=a;
        y=b;

    }

    public int Cuadrante(){
        int emaitza=0;
        if (this.x<0 && this.y>0) {
            emaitza=2;
        }
        if (this.x>0 && this.y>0){
            emaitza=1;
        }
        if (this.x<0 && this.y<0){
            emaitza=3;
        }
        if (this.x>0 && this.y<0){
            emaitza=4;
        }
        return(emaitza);
    }

    public void Muestra(){
        System.out.println("X koordenatua: "+this.x);
        System.out.println("Y koordenatua: "+this.y);

    }

    public int getX(){

        return(x);
    }
    public int getY(){

        return(y);
    }

    public void setY(int y){

        this.y=y;
    }

    public void setX(int x){

        this.x=x;
    }

}
