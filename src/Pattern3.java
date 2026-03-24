public class Pattern3 {

        public void pattern3(int N){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Pattern3 obj=new Pattern3();
            int N=10;
            obj.pattern3(N);
        }
    }
