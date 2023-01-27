
package orders;
import items.Item;

public class Order {
    private Client client;
    private int orderNumber;
    private Item item;

    public Order(Client a,int b, Item c){
        this.client=a;
        this.orderNumber=b;
        this.item=c;
    }
    public void show(){
        System.out.println(this.client.getIdNumber());
        System.out.println(this.client.getName());
        System.out.println(this.orderNumber);
        this.item.show();
    }
}
