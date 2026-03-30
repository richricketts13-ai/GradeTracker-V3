import java.util.ArrayList;
import java.util.Collections;


public class Student {
    //Fields
    private String name;

    private ArrayList<Double> grades;

    //Constructor

    public Student(String name) {
        this.name = name;

        this.grades = new ArrayList<>();

    }

    //Getters

    public String getName() {

        return this.name;
    }


    //Methods
    public void addGrade(double grade) {
        if (grade < 0 || grade > 100) {

            System.out.println("Invalid grade. Please enter a value between 0 and 100.");

        } else {

            this.grades.add(grade);
        }

    }





    public void removeGrade(int index) {

        if (this.grades.isEmpty()) {

            System.out.println("No grades to remove.");

        } else if (index < 1 || index > this.grades.size()) {

            System.out.println("Invalid grade index.");

        } else {

            double rGrade = this.grades.remove(index - 1);// Adjusting for 1-based index
            

           System.out.println("Grade successfully removed: " + rGrade);
            
        }

    }
        

    


    public double findAverage() {

        if (this.grades.isEmpty()) {
            System.out.println("No grades available to calculate average.");
            return 0.0;
        }
        double sum = 0.0;

        for (int i = 0; i < this.grades.size(); i++) {

            sum += this.grades.get(i);
        }
        double average = sum / this.grades.size();
        
    return average;
    }



    public double findMaxGrade() {

    if (this.grades.isEmpty()) {

        System.out.println("No grades available to calculate maximum.");
        return 0.0;
    }

    return Collections.max(this.grades);
 }





    public double findMinGrade() {

        if (this.grades.isEmpty()) {

            System.out.println("No grades available to calculate minimum.");

            return 0.0;
        }

     return Collections.min(this.grades);
    }

   



    public void viewGrades() {

        System.out.println("Grades for " + this.name + ":");
        
        if (this.grades.isEmpty()) {

            System.out.println("No grades to display.");
         } else {
            for (int i = 0; i < this.grades.size(); i++) {

                System.out.println((i + 1) + ". " + this.grades.get(i));
            }
        }

    }

}


    

    

