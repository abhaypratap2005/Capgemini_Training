package evaluation;
import java.util.*;

public class RemoveInvalidParentheses {
    public static String removeInvalid(String s) {
        Stack<Integer> st = new Stack<>();
        boolean[] remove = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(i);
            } else if (ch == ')') {
                if (!st.isEmpty()) {
                    st.pop();
                } else {
                    remove[i] = true;
                }
            }
        }

        while (!st.isEmpty()) {
            remove[st.pop()] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!remove[i]) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "a)b(c)d";
        System.out.println(removeInvalid(s));
    }

}
