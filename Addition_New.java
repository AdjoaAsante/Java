import java.util.Scanner;
public class Addition_New
 {
   public static void main(String[]args)
   {
    Scanner input = new Scanner(System.in);
    int number1;
    int number2;
    int sum;
    double average;
    System.out.print("Please  enter first integer: ");
    number1 = input.nextInt();
    System.out.println("Please enter second integer:");
    number2 = input.nextInt();
    sum = number1 + number2;
    average = sum / 2.0;
    System.out.println("Sum = " + sum);
    System.out.println("Average = " + average);

 } 
}
