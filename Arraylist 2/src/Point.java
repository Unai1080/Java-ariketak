public class Point {
    private int x;
    private int y;
    public Point(int a, int b){
        this.x=a;
        this.y=b;
    }
    public String toString(){
        return ( "X: "+this.x +" Y: "+y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
