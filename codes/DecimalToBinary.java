package projects;
import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of tries");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter the number");
            int a = sc.nextInt();
            int remainder=0;
            StringBuilder sb = new StringBuilder();
//            int b = Integer.parseInt(Integer.toBinaryString(a));
            while(a>0){
                remainder = a%2;
                sb.append(remainder);
                a = a/2;
            }


          System.out.println(sb.reverse());
        }
    }
}
