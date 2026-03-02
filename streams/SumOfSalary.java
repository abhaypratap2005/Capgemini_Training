package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.*;

public class SumOfSalary {

   public  static void main(String[] args) {


       //Function
        Function<Integer, Integer>  doubleIt = x -> 2*x;
        System.out.println(doubleIt.apply(100));

        //consumer
       Consumer<Integer> consumer =  x -> System.out.println(x);

       //Method reference
       List<String> lst= Arrays.asList("Abhay", "Pratap", "Singh");
       lst.forEach(x -> System.out.println(x));
      lst.forEach(System.out::println);    //method ko as a perimeter de rahe h
    }

    //constructor reference
    List<String> name= Arrays.asList("Abhay", "Pratap", "Singh");
        List<MobilePhone> mobilePhoneList = name.stream().map(MobilePhone::new).collect(Collectors.toList());


}

class MobilePhone{
    String name ;

    public MobilePhone(String name){
        this.name = name;

    }

}
