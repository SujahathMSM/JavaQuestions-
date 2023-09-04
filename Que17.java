import java.util.Scanner;

public class Que17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total_height = 0;
        double total_weight  = 0;
        for (int i = 0; i<100; i++) {
            System.out.println("Enter the Height: ");
            int height = input.nextInt();

            if (height < 0) {
                System.out.println("Invalid Value, Enter in again: ");
                height = input.nextInt();
            }
            total_height+= height;

            System.out.println("Enter the Weight: ");
            int weight = input.nextInt();

            if (weight < 0) {
                System.out.println("Invalid Value, Enter in again: ");
                weight = input.nextInt();
            }
            total_weight+=weight;

        }

        double avg_height = total_height/ 100;
        double avg_weight = total_weight / 100;
        System.out.println("Average Height: "+ avg_height);
        System.out.println("Average Weight: "+ avg_weight);
    }
}
