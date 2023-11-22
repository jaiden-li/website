import java.util.Scanner;

public class AHSGradeCalculator{

    float term1;
    String desired_grade;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your term 1 grade?");
        term1 = scanner.nextFloat();
        System.out.println("What is your desired course/final grade? LETTER GRADES ONLY");
        desired_grade = scanner.nextLine();
    }
}