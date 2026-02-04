public class bsrec {
    public static void main(String[] args) {
        int[]arr={29,43,55,23,22,100};
        int target=10;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[]arr,int target,int s,int e){
        if (s > e) {
            return -1;
        }
        int m=s+(e-s)/2;

        if(arr[m]==target){
            return m;

        }
        if (target<arr[m]){
            search(arr,target,s,m-1);
        }
        return search(arr,target,s+1,e);
    }
}
