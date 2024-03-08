public class setcountbit {
    public static int count(int n){
        int k=0;
        while(n>0){
            if((n&1)==0){
                k++;
            }
            n=n>>1;
        }
        return k;
    }
    public static void main(String[] args) {
        System.out.println(count(8));
    }
}
