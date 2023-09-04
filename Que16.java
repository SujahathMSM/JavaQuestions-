import java.util.Scanner;

public class Que16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0, count = 10;
        double maximum = 0, minimum = 100;

        for (int i = 0; i< 10; i++) {
            System.out.print("Enter the marks("+i+"): ");
            int marks = input.nextInt();
            total+= marks;

            if (marks > maximum) {
                maximum = marks;
            }

            if (marks < minimum) {
                minimum = marks;
            }
        }

        System.out.println("Total: "+ total);
        System.out.println("Max: "+ maximum);
        System.out.println("Min: "+ minimum);
        System.out.println("Avg: "+  ((double)total / count));
    }
}
