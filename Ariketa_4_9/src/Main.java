public class Main {

    public static void main(String[] args) {
        int N;
        N = 5;
        while (N < 101) {
            System.out.println(" ");
            System.out.print(N+"= ");
            multiplo(N);
            System.out.print(N);
            N++;
        }

    }

    public static void multiplo(int a) {
        int divisor = 1;
        while (divisor != a) {
            if (a % divisor == 0) {
                System.out.print(divisor + ", ");
            }
            divisor++;
        }

    }
}