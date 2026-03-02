package streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

    static void main() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 8);

        System.out.println(lst.stream().filter( x -> x%2==0).count());
        
        
    }
}
