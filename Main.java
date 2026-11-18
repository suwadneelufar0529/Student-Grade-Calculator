import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Grade Calculator ===");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in subject 1: ");
        double mark1 = sc.nextDouble();
        System.out.print("Enter marks in subject 2: ");
        double mark2 = sc.nextDouble();
        System.out.print("Enter marks in subject 3: ");
        double mark3 = sc.nextDouble();

        double total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("\\nStudent: " + name);
        System.out.println("Total marks: " + total + " / 300");
        System.out.printf("Average: %.2f%%%n", average);

        if (mark1 < 35 || mark2 < 35 || mark3 < 35) {
            System.out.println("Grade: Fail");
        } else if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        sc.close();
    }
}
