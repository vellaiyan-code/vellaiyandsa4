package arr;

public class recursion1 {
    public static void main(String[] args) {
        int[]arr={4,7,9,10,15};
        System.out.println(sorted(arr,0));

    }
    static boolean sorted(int[]arr,int index){
        if (index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&& sorted(arr,index+2);
    }
}
