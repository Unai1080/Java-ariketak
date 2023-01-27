package txoriak;

public class Bird {
    private char sex;
    private int age;
    public static int numberOfBirds=0;
    private PersonalData names;

    public Bird(char a, int b,PersonalData c){
        this.sex=a;
        this.age=b;
        this.names=c;

        numberOfBirds++;
    }

    public int getNumberOfBirds() {
        return numberOfBirds;
    }
    public void whoAmI(){
        System.out.println(this.sex);
        System.out.println(this.age);
    }
    public void sing(){
        System.out.println("My name is: " +this.names.getNameOfTheBird() +". I am a Bird");
    }

    public PersonalData getNames() {
        return names;
    }
}