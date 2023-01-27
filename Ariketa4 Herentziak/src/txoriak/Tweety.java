package txoriak;

public class Tweety extends Canary{
    private int numerOfMovies;

    public Tweety(char sex,int age, int numerOfMovies, PersonalData c){
        super(sex, age,c);
        this.numerOfMovies=numerOfMovies;
    }
    public Tweety(char sex,int age,float size, int numerOfMovies, PersonalData c){
        super(sex, age, size, c);
        this.numerOfMovies=numerOfMovies;
    }
    public void sing(){
        System.out.println("My name is: " +super.getNames().getNameOfTheBird() +". I'm tweety");
    }
    public static void main(String[] args){
        PersonalData a = new PersonalData("Koko", "Pablo");
        PersonalData b = new PersonalData("Perry", "Kevin");
        Tweety t1= new Tweety('M', 12,12,4, a );
        Parrot p1 = new Parrot('F',8,'N',"pink", b);
        t1.whoAmI();
        p1.whoAmI();
        t1.height();
        p1.whereAreYouFrom();
        t1.setSize(18);
        t1.height();
        p1.setRegion('S');
        System.out.println(t1.getNumberOfBirds());
    }
}
