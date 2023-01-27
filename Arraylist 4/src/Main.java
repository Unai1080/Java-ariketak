public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(5);
        Integer[] a= new Integer[4];
        a[0]= 111111111;
        a[1]= 111111111;
        a[2]= 222222222;
        a[3]= 333333333;
        Integer[] b= new Integer[7];
        b[0]= 444444444;
        b[1]= 555555555;
        b[2]= 666666666;
        b[3]= 777777777;
        b[4]= 888888888;
        b[5]= 999999999;
        b[6]= 444444444;
        Integer[] c= new Integer[7];
        c[0]= 111111111;
        c[1]= 111111111;
        Integer[] d= new Integer[3];
        d[0]= 222222222;
        d[1]= 999999999;
        d[2]= 222222222;
        agenda.addEntry("Unai",a);
        agenda.addEntry("Kevin",b);
        agenda.addEntry("Haritz",c);
        agenda.display();
        agenda.addEntry("Haritz",d);
        agenda.display();
        System.out.println("Unai-ren zenbakiak: "+agenda.searchName("Unai"));
        System.out.println("111111111 zenbakia kopurua: "+agenda.numberOfPhones(111111111));
    }
}