import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Agenda {
    private Map <String, Integer[]> agenda;
    private int maxNum;

    public Agenda(int maxNum){
        this.agenda = new HashMap <String,Integer[]>();
        this.maxNum=maxNum;
    }
    public void addEntry(String name,Integer[] phoneNumbers){
        Scanner sarrera = new Scanner(System.in);
        if (!agenda.containsKey(name)){
            if (phoneNumbers.length>this.maxNum){
                System.out.println(name+" Full Agenda");
                Integer[] a= new Integer[this.maxNum];
                for (int i = 0; i < a.length; i++) {
                    a[i]=phoneNumbers[i];
                }
                agenda.put(name,a);
                System.out.println(name+" Sartuta");
            }else{
                agenda.put(name,phoneNumbers);
                System.out.println(name+" Sartuta");
            }
        }else{
            System.out.println("You agenda contains these phone number for "+name+" ");
            Integer[] b= this.agenda.get(name);
            for (int i = 0; i < b.length && b[i]!=null; i++) {
                System.out.println(b[i]);
            }
            System.out.println("Want to replace them by new ones? 0 = yes any other number = no");
            int n= sarrera.nextInt();
            if (n==0){
                if (phoneNumbers.length>this.maxNum){
                    System.out.println(name+" Full Agenda");
                    Integer[] a= new Integer[this.maxNum];
                    for (int i = 0; i < a.length; i++) {
                        a[i]=phoneNumbers[i];
                    }
                    agenda.put(name,a);
                    System.out.println(name+" Sartuta");
                }else{
                    agenda.put(name,phoneNumbers);
                    System.out.println(name+" Sartuta");
                }
            }
        }
    }
    public void display(){
        Iterator<String> it= this.agenda.keySet().iterator();
        while (it.hasNext()){
            String key = (String) it.next();
            Integer[] a = this.agenda.get(key);
            System.out.print("Name: "+key+" ,Phone numbers: ");
            for (int i = 0; i < a.length && a[i]!=null; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
    public String searchName (String name){
        String emaitza=" ";
        if (agenda.containsKey(name)){
            Integer[] a= this.agenda.get(name);
            for (int i = 0; i < a.length && a[i]!=null; i++) {
                emaitza=emaitza+ " "+ a[i].toString();
            }

        }else{
            System.out.println(name+" is not in the agenda");
        }
        return emaitza;
    }
    public int numberOfPhones(int phone){
        int kont=0;
        Iterator<String> it= this.agenda.keySet().iterator();
        while (it.hasNext()){
            String key = (String) it.next();
            Integer[] a = this.agenda.get(key);
            for (int i = 0; i < a.length && a[i]!=null ; i++) {
                if (phone==a[i]){
                    kont++;
                }
            }
        }
        return kont;
    }
}
