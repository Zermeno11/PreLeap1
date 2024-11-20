import java.util.Scanner;
public class Part6Lab4 {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.print("First Word:");
        String word = input.next();
        System.out.print("Second word:");
        String word2= input.next();
        int result = word.compareTo(word2);
        

        if(result > 0) {
            System.out.println("The first word comes before the second word.");
            
        } else if(result < 0) {
            System.out.println("The second word comes before the first word");
        
        } else {
            System.out.println("The two words are equal.");

        }
        input.close();
    }
}
