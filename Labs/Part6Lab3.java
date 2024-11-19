import java.util.Scanner;
public class Part6Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int comparisonNumber = 50;
        System.out.print("Enter a Number:");
        int number1 = input.nextInt();
        if(number1 > comparisonNumber) {
            System.out.println("Your number is greater than 50.");

        } else if (number1 < comparisonNumber) {
            System.out.println("Your number is less than 50.");
        } else {
            System.out.println("Your number is equal to 50.");
        }
        input.close();
    }
}