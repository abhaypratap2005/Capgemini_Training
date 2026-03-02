package evaluation;
import java.util.Stack;

public class StackWithO1 {

    private Stack<Integer> st = new Stack<>();
    private int minEle;


    public void push(int x) {
        if (st.isEmpty()) {
            minEle = x;
            st.push(x);
        } else if (x < minEle) {
            st.push(2 * x - minEle);
            minEle = x;
        } else {
            st.push(x);
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        int top = st.pop();
        if (top < minEle) {
            minEle = 2 * minEle - top;
        }
    }


    public int peek() {
        if (st.isEmpty()) return -1;

        int top = st.peek();
        return (top < minEle) ? minEle : top;
    }


    public int getMin() {
        if (st.isEmpty()) return -1;
        return minEle;
    }

    public static void main(String[] args) {
        StackWithO1 s = new StackWithO1();

        s.push(5);
        s.push(3);
        s.push(7);
        s.push(2);

        System.out.println(s.getMin()); // 2
        s.pop();
        System.out.println(s.getMin()); // 3
        System.out.println(s.peek());   // 7
    }
}
