import java.util.Scanner;
public class Part5Lab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name:");
        String name = input.next();
        System.out.println("name:" + name);
        System.out.print("Enter your age:");
        int age = input.nextInt();
        System.out.println("age:" + age);
        System.out.print("Enter why you want to learn to code:");
        String why = input.nextLine();
        System.out.println("why you want to code:" + why);


        input.close();
    }
}