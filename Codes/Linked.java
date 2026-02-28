package Projects;
import java.util.*;
public class Linked {

    public static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void display(Node head){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;

        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node x = new Node(2);
        x.next = new Node(4);
        x.next.next = new Node(5);
           x =  reverse(x);
           display(x);
    }


}
