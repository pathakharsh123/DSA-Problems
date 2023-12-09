import java.util.*;

public class p8 {
    public static int maxArea(int arr[]) {
        int maxArea = 0;
        Stack<Integer> s = new Stack<>();
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.empty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (s.empty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.empty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (s.empty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int height = arr[i];
            int area = width * height;
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxArea(heights));
    }
}
