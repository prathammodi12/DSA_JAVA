public class Pattern {

    public void pattern4(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = N; j >= i; j--) {
                System.out.print(N - j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern obj = new Pattern();
        int N = 3;
        obj.pattern7(N);
    }


    public void pattern7(int N) {
        for (int i = 0; i < N; i++) {
            //space
            for (int j = 0; j < N-i; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 1; j < N - i-1; j++) {
                System.out.print(" ");
            }

            System.out.println("");
        }

    }
}
