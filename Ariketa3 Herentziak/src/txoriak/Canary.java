package txoriak;

public class Canary extends Bird {
    float size;

    public Canary(char sex,int age){
        super(sex,age);
    }
    public Canary(char sex,int age,float size){
        super(sex,age);
        this.size=size;
    }

    public void height(){
        if (this.size > 30){
            System.out.println("High");
        } else if (this.size > 15) {
            System.out.println("Middle");
        } else {
            System.out.println("Little");
        }
    }

    public void setSize(float size) {
        this.size = size;
    }
}
