import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        int marks=sc.nextInt();

        studentGrade(marks);

    }
    public static void studentGrade(int marks) {
            String grade;

            if (marks >= 90) grade = "Grade A";
            else if (marks >= 70) grade = "Grade B";
            else if (marks >= 50) grade = "Grade C";
            else if (marks >= 35) grade = "Grade D";
            else grade = "Fail";
            System.out.print(grade);
    }
}

