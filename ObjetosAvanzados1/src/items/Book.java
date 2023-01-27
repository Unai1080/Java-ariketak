package items;

public class Book extends Item {
    private int numPages;

    public Book(int a) {
        super();
        this.numPages=a;
    }
    public void show(){
        super.show();
        System.out.println(this.numPages);
    }
    public String fullCode(){
        return(code+" "+title+" "+this.numPages);
    }
}
