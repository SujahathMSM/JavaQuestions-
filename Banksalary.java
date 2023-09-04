import java.util.Scanner;

public class Banksalary {
    public static void main(String[] args) {
        System.out.println("--------Welcome to Salary Calculator--------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Employees: ");
        int numEmp = input.nextInt();

        int totalSalary = 0;
        for (int i = 1; i <= numEmp;i++) {
            System.out.print("Input Salary-"+i+" : ");
            int salary = input.nextInt();
            totalSalary+=salary;
        }

        System.out.println("Total Salary is: "+ totalSalary);

        int rs5000 = totalSalary / 5000;
        System.out.println("rs5000 notes: "+ rs5000);

        int rs1000 = ( totalSalary -= (5000*rs5000) ) /1000;
        System.out.println("rs1000 notes: " + rs1000);

        int rs500 = ( totalSalary -= (1000*rs1000) ) /500;
        System.out.println("rs500 notes: " + rs500);

        int rs100 = ( totalSalary -= (500*rs500) ) /100;
        System.out.println("rs100 notes: " + rs100);

        int rs50 = ( totalSalary -= (100*rs100) ) /50;
        System.out.println("rs50 notes: " + rs50);

        int rs20 = ( totalSalary -= (50*rs50) ) /20;
        System.out.println("rs20 notes: " + rs20);

        int rs10 = ( totalSalary -= (20*rs20) ) /10;
        System.out.println("rs10 notes: " + rs10);

        int rs5 = ( totalSalary -= (10*rs10) ) /5;
        System.out.println("rs5 coins: " + rs5);

        int rs2 = ( totalSalary -= (5*rs5) ) /2;
        System.out.println("rs2 coins: " + rs2);

        int rs1 = (totalSalary -= (2 * rs2));
        System.out.println("rs1 coins: " + rs1);


    }
}
