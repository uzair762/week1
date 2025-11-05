
package P11;
import java.util.Scanner;
public class StudentGradeCalculator
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Quiz Marks (out of 15): ");
        int quiz = scanner.nextInt();

        System.out.print("Enter Assignment Marks (out of 10): ");
        int assignment = scanner.nextInt();

        System.out.print("Enter Mid-Term Marks (out of 25): ");
        int midTerm = scanner.nextInt();

        System.out.print("Enter Final Exam Marks (out of 50): ");
        int finalExam = scanner.nextInt();

       
        int totalMarks = quiz + assignment + midTerm + finalExam;

       
        double average = (double) totalMarks / 100 * 100;

        // results
        System.out.println("\nTotal Marks = " + totalMarks);
        System.out.println("Average = " + average);

        // grades
        if (average >= 85) 
        {
            System.out.println("Grade = A");
        } else if (average >= 70) 
        {
            System.out.println("Grade = B");
        } else if (average >= 50)
        {
            System.out.println("Grade = C");
        } else
        {
            System.out.println("Grade = Fail");
        }
    }
}

    

