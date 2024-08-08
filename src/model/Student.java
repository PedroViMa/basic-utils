import java.util.*;
import java.util.stream.Collectors;

public class Student {

    static private final Scanner scan = new Scanner(System.in);
    static private String name;
    static private String grade;
    static private final Map<String, String> scores = new TreeMap<>(); // key for signature and value for the grade

    public static void getGrades() {
        consoleValues();

        System.out.println();
        String head = String.format("Student name: %-30s Grade: %s", name, grade);
        Arrays.stream(head.split(""))
                .forEach(s -> System.out.print("-"));
        System.out.println('-');
        System.out.println(head);
        Arrays.stream(head.split(""))
                .forEach(s -> System.out.print("-"));
        System.out.println('-');

        scores.forEach((x, y) -> System.out.printf("\t\tSignature: %-26sScore: %.1f\n", x, Double.parseDouble(y)));

        Arrays.stream(head.split(""))
                .forEach(s -> System.out.print("-"));
        System.out.println('-');

        double avg = scores.values().stream()
                .map(Double::parseDouble)
                .collect(Collectors.averagingDouble(d -> d));

        System.out.printf("Final average: %-8.2f Status: %s\n\n", avg, level(avg));

        scores.clear();

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

    private static String level(double avg) {
        if (avg < 6) {
            return "Don't passed.";
        } else if (avg < 8) {
            return "Passed with poor level.";
        } else if (avg < 9) {
            return "Passed with good level.";
        } else {
            return "Passed with excellent level.";
        }
    }


}
