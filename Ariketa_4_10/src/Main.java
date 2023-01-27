public class Main {

    public static void main(String[] args) {
        int N;
        N = 4;
        System.out.print("1, 2, 3, ");
        while (N < 10001) {
            multiplo(N);
            N++;
        }

    }

    public static void multiplo(int a) {
        int divisor = 2;
        boolean primo=true;
        while (divisor != a-1) {
            if (a % divisor == 0) {
                primo=false;
                break;
            }
            divisor++;
        }
        if (primo){
            System.out.print(a+ ", ");
        }
    }
}