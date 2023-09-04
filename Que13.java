import java.util.Scanner;

public class Que13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find the factorial: ");
        int Number = input.nextInt();
        int fact = 1;

        for (int i = Number; i>=1; i--) {
            fact*=i;
        }

        System.out.println("Factorial of "+Number+" is: " + fact);
    }
}
