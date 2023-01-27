public class Main {
    public static void main(String[] args) {
        Matrix1 matriz = new Matrix1(3,4);
        Matrix1 matriz2 = new Matrix1(3,4);
        matriz2.loadByColumns();
        matriz2.display();
        matriz2.reverseRows();
        matriz2.display();
    }
}