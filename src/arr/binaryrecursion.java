package arr;

import java.util.ArrayList;

public class binaryrecursion {
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 4, 4};
        System.out.println(find(arr, 9, 0));
        System.out.println(findallindex(arr, 4, 0, new ArrayList<>()));
        System.out.println(findallindex2(arr,4,0));

    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static ArrayList<Integer> findallindex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findallindex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findallindex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == target) {
            return list;
        }
        // this will be contain for that function call only
        if (arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls=findallindex2(arr,target,index+1);
        list.addAll(ansfrombelowcalls);
        return list;
    }
}
