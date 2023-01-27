package items;

import items.Item;

public class Record extends Item {
    private String discography;

    public Record(String a){
        super();
        this.discography=a;
    }
    public void show(){
        super.show();
        System.out.println(this.discography);
    }
}
