import java.util.*;

public class q5 {
    public static void fisrtNonrepeating(String s) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void main(String[] args) {
        String s = "aabccxb";
        fisrtNonrepeating(s);
    }
}
