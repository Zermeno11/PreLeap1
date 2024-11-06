import java.lang.Math;
public class Part4Lab2 {
    public static void main(String[] args) {
        double side1, side2;
        side1 = 5;
        side2 = 3;
        double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
        System.out.println("The length of the hypotenuse is:" + hypotenuse);
    }
}