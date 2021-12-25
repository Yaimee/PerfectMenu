import java.util.Scanner;

public class Scan {

    private Scanner scanner = new Scanner(System.in);

    public String inputString() {
        return scanner.nextLine();
    }

    public int inputInteger() {

        int input = 0;
        boolean run;
        do {
            System.out.print("Enter an integer value: ");
            try {
                input = scanner.nextInt();
                scanner.nextLine();
                run = false;
            } catch (Exception e) {
                System.out.println("Invalid input");
                input = 0;
                run = true;
            }
        } while (run);

        return input;

    }

    public double inputDouble() {

        double input = 0;
        boolean run;
        do {
            run = false;
            System.out.print("Enter a double value: ");
            try {
                input = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input");
                run = true;
            }
        } while (run);

        return input;

    }

}
