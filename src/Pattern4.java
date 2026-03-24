public class Pattern4 {

        public void pattern4(int N){
            for(int i=1; i<=N; i++){
                for(int j=N; j>=i; j--){
                    System.out.print(N-j+1);
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Pattern4 obj=new Pattern4();
            int N=5;
            obj.pattern4(N);
        }

}
