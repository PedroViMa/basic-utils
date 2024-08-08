import java.util.Scanner;

public class Menu {

    private final Scanner scan;

    enum MenuMain {
        CALCULATOR,
        ENCODER,
        AVERAGE,
        EXIT
    }

    public enum MenuCalculator {
        ADD,
        SUBSTRACT,
        MULTIPLY,
        DIVIDE,
        EXIT
    }

    enum MenuEncoder {
        ENCODE,
        DECODE,
        EXIT
    }

    public Menu() {
        scan = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("*****************************");
        System.out.println("******** Basic Utils ********");
        System.out.println("*****************************");
        MenuMain opt;

        while (true) {
            opt = mainMenu();

            switch (opt) {
                case CALCULATOR:
                    calculator();
                    break;
                case ENCODER:
                    encoder();
                    break;
                case AVERAGE:
                    studentAverage();
                    break;
                case EXIT:
                    return;
            }
        }
    }

    private void calculator() {
        MenuCalculator opt;

        while (true) {
            opt = menuCalculator();

            switch (opt) {
                case ADD:
                    Calculator.add();
                    break;
                case SUBSTRACT:
                    Calculator.substract();
                    break;
                case MULTIPLY:
                    Calculator.multiply();
                    break;
                case DIVIDE:
                    Calculator.divide();
                    break;
                case EXIT:
                    return;
            }
        }
    }

    private void encoder() {
        MenuEncoder opt;

        while (true) {
            opt = menuEncoder();

            switch (opt) {
                case ENCODE:
                    Encoder.encodeBase64();
                    break;
                case DECODE:
                    Encoder.decodeBase64();
                    break;
                case EXIT:
                    return;
            }
        }
    }

    private void studentAverage() {
        System.out.println("\n===== Student average calculator =====");
        Student.getGrades();
    }

    private MenuMain mainMenu() {
        int opt;

        System.out.println("1.- Calculator");
        System.out.println("2.- Encoder");
        System.out.println("3.- Student average calculator");
        System.out.println("4.- Exit");
        System.out.print("Choose an option: ");

        do {
            opt = scan.nextInt();
            if(opt <= 0 || opt >= 5) {
                System.out.print("Choose a valid option: ");
            }
        } while(opt <= 0 || opt >= 5);

        MenuMain[] menu = MenuMain.values();
        return menu[opt - 1];
    }

    private MenuCalculator menuCalculator() {
        int opt;

        System.out.println("\n===== Calculator =====");
        System.out.println("1.- Sum");
        System.out.println("2.- Substract");
        System.out.println("3.- Multiply");
        System.out.println("4.- Divide");
        System.out.println("5.- Exit");
        System.out.print("Choose an option: ");

        do {
            opt = scan.nextInt();
            if(opt <= 0 || opt >= 6) {
                System.out.print("Choose a valid option: ");
            }
        } while(opt <= 0 || opt >= 6);

        MenuCalculator[] menu = MenuCalculator.values();
        return menu[opt - 1];
    }

    private MenuEncoder menuEncoder() {
        int opt;

        System.out.println("\n===== Encoder =====");
        System.out.println("1.- Encode");
        System.out.println("2.- Decode");
        System.out.println("3.- Exit");
        System.out.print("Choose an option: ");

        do {
            opt = scan.nextInt();
            if(opt <= 0 || opt >= 4) {
                System.out.print("Choose a valid option: ");
            }
        } while(opt <= 0 || opt >= 4);

        MenuEncoder[] menu = MenuEncoder.values();
        return menu[opt - 1];

    }

}