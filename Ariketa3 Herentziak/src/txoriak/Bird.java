package txoriak;

public class Bird {
    char sex;
    int age;
    public static int numberOfBirds=0;

    public Bird(char a, int b){
        this.sex=a;
        this.age=b;
        numberOfBirds++;
    }

    public int getNumberOfBirds() {
        return numberOfBirds;
    }
    public void whoAmI(){
        System.out.println(this.sex);
        System.out.println(this.age);
    }
}