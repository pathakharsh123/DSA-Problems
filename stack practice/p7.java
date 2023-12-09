import java.util.*;

public class p7 {
    public static boolean duplicateParenthesis(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (ch == ')') {
                int count = 0;
                while ((st.peek() != '(')) {
                    st.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "((a+b)+(c+d))";
        System.out.println(duplicateParenthesis(s));
    }
}
