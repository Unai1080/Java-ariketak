package orders;

public class Client {
    private int idNumber;
    private String name;

    public Client(int a, String b){
        this.idNumber=a;
        this.name=b;
    }
    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }
}
