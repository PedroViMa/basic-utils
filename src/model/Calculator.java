import java.util.Scanner;
import java.util.function.BiFunction;

public class Calculator {

    static private final Scanner scan = new Scanner(System.in);
    static private BiFunction<Integer, Integer, String> operation;
    static private int num1, num2;

    public static void add() {
        operation = (a, b) -> String.format("The result of %d+%d is: %d", a, b, a+b);
        consoleValues();
        System.out.println(operation.apply(num1, num2));
    }

    public static void substract() {
        operation = (a, b) -> String.format("The result of %d-%d is: %d", a, b, a-b);
        consoleValues();
        System.out.println(operation.apply(num1, num2));

    }

    public static void multiply() {
        operation = (a, b) -> String.format("The result of %d*%d is: %d", a, b, a*b);
        consoleValues();
        System.out.println(operation.apply(num1, num2));

    }

    public static void divide() {
        operation = (a, b) ->
                (b == 0) ? "You can't divide by zero." :
                        String.format("The result of %d/%d is: %2f", a, b, a.doubleValue()/b);
        consoleValues();
        System.out.println(operation.apply(num1, num2));

    }

    private static void consoleValues() {
        System.out.print("Enter the value for a: ");
        num1 = scan.nextInt();
        System.out.print("Enter the value for b: ");
        num2 = scan.nextInt();
    }

}
