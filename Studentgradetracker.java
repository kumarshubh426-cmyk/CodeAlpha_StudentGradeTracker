import java.util.ArrayList;
import java.util.Scanner;

public class Studentgradetracker{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Input student details
        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter student name: ");
            String name = sc.next();

            System.out.print("Enter grade: ");
            double grade = sc.nextDouble();

            names.add(name);
            grades.add(grade);
        }

        // Find highest, lowest and average
        double highest = grades.get(0);
        double lowest = grades.get(0);
        double sum = 0;

        for (double grade : grades) {

            sum += grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = sum / grades.size();

        // Summary Report
        System.out.println("\n========== STUDENT GRADE REPORT ==========");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(
                    "Student: " + names.get(i) +
                            " | Grade: " + grades.get(i)
            );
        }

        System.out.println("------------------------------------------");
        System.out.println("Average Grade : " + average);
        System.out.println("Highest Grade : " + highest);
        System.out.println("Lowest Grade  : " + lowest);

        System.out.println("==========================================");

        sc.close();
    }
}