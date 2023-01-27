package txoriak;

public class Tweety extends Canary{
   int  numerOfMovies;

   public Tweety(char sex,int age, int numerOfMovies){
       super(sex, age);
       this.numerOfMovies=numerOfMovies;
   }
    public Tweety(char sex,int age,float size, int numerOfMovies){
        super(sex, age, size);
        this.numerOfMovies=numerOfMovies;
    }
    public static void main(String[] args){
       Tweety t1= new Tweety('M', 12,12,4);
       Parrot p1 = new Parrot('F',8,'N',"pink");
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
