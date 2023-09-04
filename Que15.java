import java.util.Scanner;

public class Que15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i <50; i++) {
            System.out.println("Enter number "+ i);
            int number = input.nextInt();

            if (number > 100) {
                count++;
            }
        }

        System.out.println("Amount of number that is greater than 100: "+ count);
    }
}
