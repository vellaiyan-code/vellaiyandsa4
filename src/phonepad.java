public class phonepad {
    public static void main(String[] args) {
        phone(" "," 12");

    }
    static void phone(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
         // this will convert '2' into 2
        int digit=up.charAt(0)-'0';

        for (int i = (digit-1)*3; i < digit*3; i++) {

            char ch=(char) ('a'+i);
             phone(p+ch,up.substring(1));

        }


    }
}
