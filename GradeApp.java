import java.util.Scanner;

public class GradeApp {
    public static void main(String[] args) {
        runMenu();
    }





















    public static void runMenu() {

        GradeTracker gradeTracker = new GradeTracker();

        Scanner input = new Scanner(System.in);

        int choice;

        while (true) {
            System.out.println("\nGrade Tracker Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Select Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter student name: ");
                    String name = input.nextLine();
                    gradeTracker.addStudent(name);
                }
                case 2 -> {
                    gradeTracker.viewStudents();
                    System.out.println("Enter student index to remove: ");
                    int index = input.nextInt();
                    input.nextLine(); // Consume newline
                    gradeTracker.removeStudent(index);
                }
                case 3 -> {
                    gradeTracker.viewStudents();

                    System.out.println("Enter student name:  ");

                    String name = input.nextLine();

                    Student s = gradeTracker.selectStudent(name);

                    if (s != null) {

                        studentMenu(s, input);
                    } else {
                        System.out.println("Try again...");
                    }
                 }
                 case 4 -> {
                    System.out.println("Exiting Grade Tracker. Goodbye!");
                    input.close();
                    return;
                 
                }
            }
        }
    }




    public static void studentMenu(Student student, Scanner input) {
        
        int choice;

        while (true) { 
            System.out.println("\nStudent Menu for " + student.getName());
            System.out.println("1. Add Grade");
            System.out.println("2. Remove Grade");
            System.out.println("3. View Grades");
            System.out.println("4. Find Average Grade");
            System.out.println("5. Find Highest Grade");
            System.out.println("6. Find Lowest Grade");
            System.out.println("7. Return to Main Menu");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter grade to add: ");

                    double grade = input.nextDouble();
                    input.nextLine(); // Consume newline

                    student.addGrade(grade);
                }
                case 2 -> {
                    System.out.println("Enter grade index to remove: ");

                    int index = input.nextInt();
                    input.nextLine(); // Consume newline
        
                    student.removeGrade(index);
            
                }
                case 3 -> student.viewGrades();

                case 4 ->System.out.println("Average Grade: " + student.findAverage());

                case 5 ->System.out.println("Highest Grade: " + student.findMaxGrade());

                case 6 ->System.out.println("Lowest Grade: " + student.findMinGrade());

                case 7 -> {
                    System.out.println("Returning to Main Menu.");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }

         }    

    }
}
        


