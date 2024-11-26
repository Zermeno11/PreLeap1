import java.util.Scanner;
public class Part7Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Favourite color");
        System.out.println("1. Blue");
        System.out.println("2. Red");
        System.out.println("3. Black");
        System.out.print("Enter your choice(1-3):");
        int choice = input.nextInt();
        
        switch (choice) {
        case 1:
            System.out.println(" Your favourite color is Blue");
            break;
         case 2:
            System.out.println("Your favourite color is Red");
            break;
         case 3:
            System.out.println("Your favourite color is Black");
            break;
        }
       


        input.close();
    




    }
}