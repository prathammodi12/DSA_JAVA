public class Pattern2 {

    public void pattern2(int N){
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern2 obj=new Pattern2();
        int N=10;
        obj.pattern2(N);
    }
}
