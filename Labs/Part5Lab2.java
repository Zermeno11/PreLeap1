import java.util.Scanner;
public class Part5Lab2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        double decimal1 = input.nextDouble();
        System.out.print("Enter the second number:");
        double decimal2 = input.nextDouble();
        System.out.print("Enter tne third number:");
        double decimal3 = input.nextDouble();
        System.out.print("Enter the fourth number:");
        double decimal4 = input.nextDouble();
        System.out.print("enter the fifth number:");
        double decimal5 = input.nextDouble();
        double average = (decimal1+decimal2+decimal3+decimal4+decimal5)/5;
        System.out.println("The average of the five numbers is:" + average);

        input.close();
        
    }
}