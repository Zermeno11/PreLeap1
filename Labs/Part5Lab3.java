import java.util.Scanner;

public class Part5Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;

        System.out.print("Enter the first number:");
        num1 = input.nextDouble();
        System.out.print("Enter the second number:");
        num2 = input.nextDouble();

        input.nextLine();

        System.out.print("choose an operation (add or subtract):");
        String operation = input.nextLine();
        if (operation.equals("add")) {
             result = num1 + num2;
        } else if (operation.equals("subtract")) {
             result = num1 - num2;
        } else {
            System.out.println("Invalid operation. Please enter 'add' or 'subtract'.");
            return;
        }
        

        System.out.println("Result: " + result);

        input.close();


    }
}