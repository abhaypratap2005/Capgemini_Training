package Projects;
import java.util.*;



public class StudentProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> student = new ArrayList<>();

        System.out.println("Enter how many students you want to add");
        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            student.add(s);
        }

        System.out.println(student);

        System.out.println("Enter the idex you want to change");
        int ind = sc.nextInt();

            System.out.println("Enter the new one");

            sc.nextLine();
            String strnew = sc.nextLine();
            student.set(ind, strnew);

            System.out.println(student);

            System.out.println(student.size());

            System.out.println("Enter the person you want to delete");
            sc.nextLine();
            String person = sc.nextLine();

            student.remove(person);

            System.out.println(student);

    }
}
