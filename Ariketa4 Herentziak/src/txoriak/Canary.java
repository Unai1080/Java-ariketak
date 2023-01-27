package txoriak;

public class Canary extends Bird {
    private float size;

    public Canary(char sex,int age, PersonalData c){
        super(sex,age,c);
    }
    public Canary(char sex,int age,float size, PersonalData c){
        super(sex,age,c);
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
    public void sing(){
        System.out.println("My name is: " +super.getNames().getNameOfTheBird() +". Pio I am a Canary");
    }
}