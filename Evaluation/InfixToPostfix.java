package Evaluation;
import java.util.*;

public class InfixToPostfix {


    public static String convert(String postfix) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            } else {
                String b = stack.pop();
                String a = stack.pop();
                stack.push(a + b + ch);
            }
        }
        return stack.pop();
    }

    public static int evaluate(String postfix) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isDigit(ch)) {
                st.push(ch - '0');
            } else {
                int b = st.pop();
                int a = st.pop();

                switch (ch) {
                    case '+': st.push(a + b); break;
                    case '-': st.push(a - b); break;
                    case '*': st.push(a * b); break;
                    case '/': st.push(a / b); break;
                }
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String postfix = "23*54*+";
        System.out.println("Expression: " + convert(postfix));
        System.out.println("Result: " + evaluate(postfix));
    }
}
