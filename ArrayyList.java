import java.util.*;

public class ArrayyList {
    public static void pairSum(ArrayList<Integer> list, int key, int i, int j) {
        // stop if pointers cross
        if(i >= j) {
            System.out.println("pair sum doesn't exist");
            return;
        }

        int sum = list.get(i) + list.get(j);

        if(sum == key) {
            System.out.println("Found the pair sum at " + i + " and " + j);
            return;
        }

        if(sum < key) {
            pairSum(list, key, i+1, j);   // move left pointer forward
        } else {
            pairSum(list, key, i, j-1);   // move right pointer backward
        }
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        pairSum(list, 5, 0, list.size()-1);
    }
}