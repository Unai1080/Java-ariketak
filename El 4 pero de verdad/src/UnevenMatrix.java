public class UnevenMatrix {
    private Float[][] nums;
    public UnevenMatrix(){
        this.nums=new Float[4][];
    }
    public void loadRows(Float[] floats, int a){
        this.nums[a]= floats;
    }
    public void displayRow(int a){
        for (int i=0; i<this.nums[a].length;i++){
            System.out.println(this.nums[a][i]+" ");
        }
        System.out.println();
    }
    public void DisplayMatrix(){
        for (int i=0; i < this.nums.length;i++){
            for (int j=0; j < this.nums[i].length;j++){
                System.out.print(this.nums[i][j]);
            }
            System.out.println("");
        }
    }
}
