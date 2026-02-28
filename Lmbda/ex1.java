package Lmbda;

import java.util.ArrayList;
import java.util.List;

interface Calc{
    int add(int a, int b);
}

class Mycalc implements Calc{
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}


public class ex1 {

    static void main() {
        class Mycalc2 implements Calc{
            public int add(int a, int b){
                return 0;
            }
        }

        if(4<5){
            class Dummy{}  //inner class, static : dp not have access to outer object
            //non static : access to outer object
        }

        Calc c1 = new Mycalc();
        List<Integer> lst = new ArrayList<>();
        c1.add(1, 2);

        //system will create a class LambdaDemo  anonymous class object
        Calc c2 = new Calc() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };



        Calc c4 = (int a, int b) -> {return a+b;};
        Calc c5  = (int a, int b)->{return a-b;};

        Calc c6 = (a, b) -> a+b; // lambda expression


      //  list.sort(e1, e2) -> e1.empid - e2.empid;


    }

}
