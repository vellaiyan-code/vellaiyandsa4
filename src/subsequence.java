public class subsequence {

    public static void main(String[] args) {
        subseq(" ","abc");

    }

    static void subseq(String p, String up) {
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
         // take an char of two calls first you will take it or igore  it
        char ch=up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
}
