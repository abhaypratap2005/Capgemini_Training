package Evaluation;
import java.util.*;
public class CallStack {

  static Stack<String> st = new Stack<>();

  static public void printStack(String str){
      System.out.println(str);
      System.out.println(st);
  }

  static public void validate(){
      st.push(" Validate");
      printStack("From Validate");
      st.pop();
      printStack("Returning Validate");
  }

  static public void login(){
      st.push("Log in");
      printStack("From login");
      st.pop();
      validate();
      printStack("Returning Login");
  }

    static void main() {
        System.out.println("Main");
        st.push("Main");
        printStack("From main");

        login();
        st.pop();
       printStack("Returning main");
    }
}
