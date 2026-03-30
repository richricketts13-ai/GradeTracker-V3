import java.util.ArrayList;

public class GradeTracker {
    //Fields 
    
    private ArrayList<Student> students;

    //Constructor
    public GradeTracker() {

        this.students = new ArrayList<>();

    }

    //Methods

    public void addStudent(String name) {

        this.students.add(new Student(name));

        System.out.println("Student added: " + name);


    }



    public void removeStudent(int index) {

        if (this.students.isEmpty()) {

            System.out.println("No students to remove.");
            
        } else if (index < 1 || index > this.students.size()) {

            System.out.println("Invalid student index.");
            
        } else {

            Student rStudent = this.students.remove(index - 1);

            System.out.println("Student successfully removed: " + rStudent.getName());
        }

  }




    public Student selectStudent(String name) { 
        if (this.students.isEmpty()) {

            System.out.println("No students available.");
            return null;
        }
        else if (name == null || name.isBlank()) {
            System.out.println("Invalid student name.");

            return null;
        } else {
            for (Student student: this.students) {

                if (student.getName().equalsIgnoreCase(name)) {
                    return student;
                }
                
            }
            System.out.println("Student not found: " + name);
            return null;
        }

    }

        

        

    


    public void viewStudents() {

        if (this.students.isEmpty()) {

            System.out.println("No students to display.");

        } else {
            System.out.println("Students:");

            for (int i = 0; i < this.students.size(); i++) {

                System.out.println((i + 1) + ". " + this.students.get(i).getName());
            }
        }
    }
}












