package txoriak;

public class Start {
    public static void main(String[] args) {
        PersonalData a = new PersonalData("Koko", "Pablo");
        PersonalData b = new PersonalData("Perry", "Kevin");
        PersonalData c = new PersonalData("Carlos III", "Franco");
        PersonalData d = new PersonalData("Tucán", "Jose Luis");
        Tweety t1 = new Tweety('M', 12, 12, 4, a);
        Tweety t2 = new Tweety('F', 9, 10, 2, b);
        Tweety t3 = new Tweety('M', 6, 6, 0, c);
        Parrot p1 = new Parrot('F',8,'N',"pink", d);
        t1.sing();
        t2.sing();
        t3.sing();
        p1.sing();
    }
}
