
import java.lang.reflect.*;
class Ex{
    String name;
    int age;
    String email;


    public  Ex(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
public class Main {



    public static void main(String[] args) throws IllegalAccessException {

        Ex obj = new Ex("Abhay", 21, "email");
      //class details
        Class<?> claz = obj.getClass();
        System.out.println(claz.getName());

        //Fields
        for(Field field : claz.getDeclaredFields()){
            field.setAccessible(true);

            //changing the fields
            if(field.getName().equals("age"))  field.set(obj, 34);

            System.out.println(field.getName()+"="+ field.get(obj));
        }


        //Methods
            //does nothing
        for(Method method :claz.getDeclaredMethods()){
            System.out.println("Method"+ method.getName());
        }
        }
    }
