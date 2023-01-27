package txoriak;

public class PersonalData {

    private String nameOfTheBird;
    private String nameOfTheOwner;

    public PersonalData(String a, String b){
        this.nameOfTheBird=a;
        this.nameOfTheOwner=b;
    }

    public String getNameOfTheBird() {
        return nameOfTheBird;
    }
}
