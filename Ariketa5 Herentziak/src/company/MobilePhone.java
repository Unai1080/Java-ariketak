package company;

public class MobilePhone {

    private String mumber;
    private int battery;

    public MobilePhone(String a, int b){
        this.mumber=a;
        this.battery=b;
    }

    public String getMumber() {
        return mumber;
    }

    public int getBattery() {
        return battery;
    }

    public void use(){
        if ( this.battery-1>0){
            this.battery=this.battery-1;
        }else{
            this.battery=0;
        }
    }

}
