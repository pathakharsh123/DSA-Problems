import java.util.*;

public class p5 {
    public static void nextGreater(int arr[]) {
        int greater[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.empty() && arr[i] >= arr[s.peek()]) { // 1st step
                s.pop();
            }
            if (s.empty()) { // 2nd step
                greater[i] = -1;
            } else {
                greater[i] = arr[s.peek()];
            }
            s.push(i); // 3rd step
        }
        for (int i = 0; i < greater.length; i++) {
            System.out.print(greater[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        nextGreater(arr);
    }
}
