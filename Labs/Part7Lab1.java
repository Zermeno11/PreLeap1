import java.util.Scanner;
public class Part7Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Menu:");
       System.out.println("1. option 1");
       System.out.println("2. Option 2");
       System.out.println("3. Option 3");
       System.out.println("4. Option 4");
       System.out.print("enter your choice (1-4): ");
       int choice = input.nextInt();

       System.out.println("You selected Option " + choice);

       input.close();

    }
}