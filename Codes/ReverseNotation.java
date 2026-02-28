package Projects;
import java.util.*;
public class ReverseNotation {


        public static String convert(String postfix) {
            Stack<String> stack = new Stack<>();

            for (int i = 0; i < postfix.length(); i++) {
                char ch = postfix.charAt(i);

                if (Character.isLetterOrDigit(ch)) {
                    stack.push(String.valueOf(ch));
                } else {
                    String b = stack.pop();
                    String a = stack.pop();
                    stack.push(ch + a + b);
                }
            }
            return stack.pop();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the exp");
            String str = sc.nextLine();
//           ab+c*de/-
            System.out.println(convert(str));
        }
    }
