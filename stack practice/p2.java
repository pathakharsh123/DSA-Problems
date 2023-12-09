import java.util.*;

public class p2 {
    public static String reverseString(String s) {
        Stack<Character> st = new Stack<>();
        int idx = 0;
        while (idx < s.length()) {
            st.push(s.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!st.empty()) {
            result.append(st.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reverseString(s));
    }
}
