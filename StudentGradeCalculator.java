import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the number of subjects: ");
                int NumSubjects = sc.nextInt();

                int[] marks = new int[NumSubjects];
                for (int i = 0; i < NumSubjects; i++) {
                    System.out.print("Enter marks for subject " + (i + 1) + ": ");
                    marks[i] = sc.nextInt();
                }
                int totalMarks = 0;
                for (int mark : marks) {
                    totalMarks += mark;
                }
                double averagePercentage = (double) totalMarks / NumSubjects;

                char Grade;
                if (averagePercentage >= 90) {
                    Grade = 'A';
                } else if (averagePercentage >= 80) {
                    Grade = 'B';
                } else if (averagePercentage >= 70) {
                    Grade = 'C';
                } else if (averagePercentage >= 60) {
                    Grade = 'D';
                } else {
                    Grade = 'F';
                }
                System.out.println("Total Marks: " + totalMarks);
                System.out.println("Average Percentage: " + averagePercentage + "%");
                System.out.println("Grade: " + Grade);

                sc.close();

    }
}
