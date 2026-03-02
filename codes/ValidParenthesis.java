package projects;
import java.util.*;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "()()";
        Boolean flag= true;
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                st.add('(');
            } else {
                if (st.size() == 0) {
                    flag = false;
                    break;

                } else {
                    st.pop();
                }
            }

        }
        System.out.println(flag);

    }
}
