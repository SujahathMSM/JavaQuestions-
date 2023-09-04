public class Que14 {
    public static void main(String[] args) {
        for (int num =1; num <=10; num++) {
            int fact = 1;
            for (int i = num; i >=1; i--) {
                fact *= i;
            }
            System.out.println("Factorial of "+num+ " is: "+ fact);
        }
    }
}
