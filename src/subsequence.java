import java.util.ArrayList;

public class subsequence {

    public static void main(String[] args) {
        subseq(" ", "abc");
        System.out.println(subseq2(" ","abc"));

    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        // take an char of two calls first you will take it or igore  it
        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    // adding as an array  list
    static ArrayList<String> subseq2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;

        }

        char ch = up.charAt(0);

        ArrayList<String> left=subseq2 (p + ch, up.substring(1));
        ArrayList<String> right= subseq2(p, up.substring(1));

        left.addAll(right);
    return left;
    }

}