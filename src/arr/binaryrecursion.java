package arr;

public class binaryrecursion {
    public static void main(String[] args) {
        int[]arr={5,8,9,4};
        System.out.println(find(arr,9,0));

    }
    static boolean find(int[]arr,int target,int index){
        if (index==arr.length){
            return false;
        }
        return arr[index]==target||find(arr,target,index+1);
    }
}
