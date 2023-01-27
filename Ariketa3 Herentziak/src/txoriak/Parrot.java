package txoriak;

public class Parrot extends Bird {
    char region;
    String color;

    public Parrot(char sex, int age, char region, String color){
        super(sex,age);
        this.region=region;
        this.color=color;
    }
    public void whereAreYouFrom() {
        if (this.region == 'N') {
            System.out.println("North");
        } else if (this.region == 'S') {
            System.out.println("South");
        } else if (this.region == 'E') {
            System.out.println("East");
        } else {
            System.out.println("West");
        }
    }

    public void setRegion(char region) {
        this.region = region;
    }
}
