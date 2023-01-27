public class NumberStatistics {

    private int[] array1= new int[100];


    public NumberStatistics(){
        for (int i=0;i<100;i++){
            this.array1[i]=0;
        }
    }
    public void addNumber (int besteZbk){
        int posizioa=amountOfNumbers();
        this.array1[posizioa]=besteZbk;
    }
    public int amountOfNumbers(){
        int kont=0;
        while (kont<100 && this.array1[kont]!=0){
            kont++;
        }
        return(kont);

    }
    public float showStatistics(){
        float babez=0;
        int kont=0;
        while (kont<100 && this.array1[kont]!=0){
            babez=babez+this.array1[kont];
            kont++;
        }
        babez=babez/kont;
        return(babez);

    }

}
