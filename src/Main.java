import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    Student s = new Student();
                    System.out.print("Enter Name: ");
                    s.name = sc.nextLine();
                    System.out.print("Enter Roll No: ");
                    s.rollNo = sc.nextInt();
                    System.out.print("Enter Maths Marks: ");
                    s.maths = sc.nextInt();
                    System.out.print("Enter Science Marks: ");
                    s.science = sc.nextInt();
                    System.out.print("Enter English Marks: ");
                    s.english = sc.nextInt();
                    System.out.print("Enter Computer Marks: ");
                    s.computer = sc.nextInt();
                    System.out.print("Enter Social Marks: ");
                    s.social = sc.nextInt();

                    s.calculateTotal();
                    s.calculatePercentage();
                    s.calculateGrade();

                    students.add(s);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students to display.");
                    } else {
                        for (Student st : students) {
                            st.displayDetails();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
