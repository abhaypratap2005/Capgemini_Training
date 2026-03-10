package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.*;

public class SumOfSalary {

    public static void main(String[] args) {


        Function<Integer, Integer> doubleIt = x -> 2 * x;
        System.out.println(doubleIt.apply(100));

        Consumer<Integer> consumer = x -> System.out.println(x);


        List<String> lst = Arrays.asList("Abhay", "Pratap", "Singh");
        lst.forEach(x -> System.out.println(x));
        lst.forEach(System.out::println);   // method ko as a parameter de rahe h

        List<String> name = Arrays.asList("Abhay", "Pratap", "Singh");
        List<MobilePhone> mobilePhoneList = name.stream()
                .map(MobilePhone::new)
                .collect(Collectors.toList());

        mobilePhoneList.forEach(x -> System.out.println(x.name));
    }
}

class MobilePhone {
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}