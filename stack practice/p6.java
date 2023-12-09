import java.util.*;

public class p6 {
    public static boolean validParenthesis(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') { // opening
                st.push(ch);
            } else { // closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((ch == ']' && st.peek() == '[') || (ch == ')' && st.peek() == '(')
                        || (ch == '}' && st.peek() == '{')) { // pair
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.empty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "({[]}())";
        System.out.println(validParenthesis(s));
    }
}
