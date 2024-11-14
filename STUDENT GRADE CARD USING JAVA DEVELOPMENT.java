import java.util.*;

public class Dharmendra_task2_question {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declare variables(subjects) for marks and total
        int S1, S2, S3, S4, S5;
        int totalMarks;
        double averagePercentage;
        char grade;

        
        System.out.print("Enter marks obtained in Telugu (out of 100): ");
        S1 = input.nextInt();
        
        System.out.print("Enter marks obtained in English (out of 100): ");
        S2 = input.nextInt();
        
        System.out.print("Enter marks obtained in Mathematics (out of 100): ");
        S3 = input.nextInt();
        
        System.out.print("Enter marks obtained in Physics (out of 100): ");
        S4 = input.nextInt();
        
        System.out.print("Enter marks obtained in Chemistry (out of 100): ");
        S5 = input.nextInt();

        totalMarks = S1 + S2 + S3 + S4 + S5;
        
        averagePercentage = (totalMarks / 5.0);
        
        // Determine grade based on average percentage
        grade = Grade(averagePercentage);

        // Display the results
        display(totalMarks, averagePercentage, grade);
    }

    public static char Grade(double averagePercentage) {
        char ch;

        if (averagePercentage >= 90) {
            ch = 'A';
        } else if (averagePercentage >= 80) {
            ch = 'B';
        } else if (averagePercentage >= 70) {
            ch = 'C';
        } else if (averagePercentage >= 60) {
            ch = 'D';
        } else if (averagePercentage >= 50) {
            ch = 'E';
        } else {
            ch = 'F';
        }
        return ch;
    }

    public static void display(int totalMarks, double averagePercentage, char grade) {
        System.out.println();
        System.out.println(" ----- Result ----- ");
        System.out.println("Total Marks: " + totalMarks + " / 500");
        System.out.println("Average Percentage: " + averagePercentage + " %");
        System.out.println("Grade: " + grade);
    }
}
