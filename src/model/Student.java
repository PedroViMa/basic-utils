import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Student {

    static private final Scanner scan = new Scanner(System.in);
    static private String name;
    static private String grade;
    static private Map<String, String> scores = new TreeMap<>(); // key for signature and value for the grade

    public static void getGrades() {
        consoleValues();
        showStudentPInfo();
    }

    private static void consoleValues() {
        String signature, score;

        System.out.print("Please enter your complete name: ");
        name = scan.nextLine();
        System.out.print("Please enter your grade: ");
        grade = scan.nextLine();
        System.out.print("Please enter the number of signatures to enroll: ");
        int sign = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < sign; i++) {
            System.out.printf("Enter the name of the signature %d: ", i+1);
            signature = scan.nextLine();
            System.out.printf("Enter the score for %s: ", signature);
            score = scan.nextLine();

            scores.put(signature, score);
        }
    }

    private static void showStudentPInfo() {
        String head = String.format("Student name: %s\t\tGrade: %s", name, grade);
        for(int i = 0; i < head.length(); i++) {
            System.out.print('-');
        }
        System.out.println();
        System.out.println(head);
        for(int i = 0; i < head.length(); i++) {
            System.out.print('-');
        }
        System.out.println();
    }


}
