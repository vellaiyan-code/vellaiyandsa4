package oopsconceptpart1;

public class rapperclasses {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        Integer num=45;
     swap(a,b);
        System.out.println(a+" "+b);
      final   A  praveen=new A("praveen");
      praveen.name="other name";
    }
    static void swap(int a ,int b){
        int temp=a;
        a=b;
        b=temp;
    }

        }
class A {
    final int num = 10;
    String name;

    public A(String name){
        this.name=name;
    }


}

