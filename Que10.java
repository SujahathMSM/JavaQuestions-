import java.util.Random;

public class Que10 {
    public static void main(String[] args) {
        Random input = new Random();

        for (int i =0; i <100; i++) {
            int number = input.nextInt(101);
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

    }
}
