package items;

public class Item {
    protected int code;
    protected String title;
    protected String author;

    public Item(int a, String b, String c){
        this.code=a;
        this.title=b;
        this.author=c;
    }
    public Item(){}

    public void show(){
        System.out.println(this.code);
        System.out.println(this.title);
        System.out.println(this.author);
    }

}
