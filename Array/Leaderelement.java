package DSA.Array;

import java.util.ArrayList;

public class Leaderelement {

    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int right = arr[n - 1];
        // result.add(2) used to add the element in array in series order
        // result.add(2,1) used to add at particular index
        result.add(right);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > right) {
                result.add(0, arr[i]);
                right = arr[i];
            }
        }
        // Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) { // Array<>anything which is written in the bracket will change the integer
                                             // or string with the particular argument passed

    }
}
