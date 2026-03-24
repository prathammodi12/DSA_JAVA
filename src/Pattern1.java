public class Pattern1 {

    public void pattern1(int N){
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern1 obj=new Pattern1();
        int N=3;
        obj.pattern1(N);
    }
}

