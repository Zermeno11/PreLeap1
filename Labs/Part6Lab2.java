public class Part6Lab2 {
    public static void main(String[] args) {
        String word1 = "apple";
        String word2 = "banana";
        String word3 = "peach";
        boolean result = word1.equals(word2);
        boolean result2 = word1.equals(word3); 
        if(result) {
            System.out.println("Word 1 is equal to Word 2."); 
            
        } else if(result2) {
            System.out.println("Word 1 is equal to Word 3.");
        } else {
            System.out.println("Word 1 is not equal to Word 2 or Word 3");
        }
        }

        
    }