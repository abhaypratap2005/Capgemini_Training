package Evaluation;
import java.util.*;

public class SortStacks {

    static void sortStack(Stack<Integer> st){
        int a = st.pop();
        sortStack(st);
            insert(st, a);
    }

    static void insert(Stack<Integer> st,int value){
        if(st.isEmpty() || st.peek()<=value){
            st.push(value);
            return;
        }
        int a = st.pop();
        insert(st, a);
        st.push(a);
    }

    static void main() {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(9);
        st.push(5);
        st.push(8);
        st.push(6);

sortStack(st);
        System.out.println(st);
    }

}
