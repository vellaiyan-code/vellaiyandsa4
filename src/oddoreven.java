public class oddoreven {
    public static void main(String[] args) {
        int n=88;
        System.out.println(isodd(n));

    }
    private static boolean isodd(int n){
        return (n &1)==1;
    }
}
