package Projects;
import java.util.*;
public class AttendanceSystem {

    public static void main(String[] args) {

        System.out.println("Welcome to the attendance Management System" +
                "\n Enter the password to continue");
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int password = 1111;
        if (n == password) {
//            ArrayList<String> lst = new ArrayList<>();
//            ArrayList<Integer> marks = new ArrayList<>();

            Map<String, Integer> studentMarks = new HashMap<>();
            while (true) {
                System.out.println("Choose one of the following option" +
                        "\n 1-For registering" +
                        "\n 2-Acces the materials" +
                        "\n 3-Access Total Marks" +
                        "\n 4-Change the password");

                int a = sc.nextInt();
                switch (a) {
                    case 1:

                        System.out.println("Enter the student details");
                        sc.nextLine();
                        String c = sc.nextLine();

                        int e = sc.nextInt();
                       studentMarks.put(c, e);
                        break;
                    case 2:
                        System.out.println("Enter the Materials you want to access");
                        System.out.println("1-for pdf" +
                                "\n 2-for doc");
                        int d = sc.nextInt();

                        System.out.println("You have accessed");
                        break;
                    case 3:
                        System.out.println("Enter the student name for total marks");
                        sc.nextLine();
                        String f = sc.nextLine();

                        if(studentMarks.containsKey(f)){
                            System.out.println(studentMarks.get(f));
                        } else {
                            System.out.println("Student does not exist");
                        }
                        break;

                    case 4:
                        System.out.println("Enter the new password");
                        int g = sc.nextInt();
                        password=g;
                        break;

                    case 5:
                        System.out.println("Thank you for visiting");
                        return;

                }
            }
        }else{
                    System.out.println("Wrong password");
                }
            }
        }
