import java.util.Scanner;
public class EnhancedAmendingVariables {
    public static void main(String[] args){
        int loopControl = 0;
        Scanner keybd = new Scanner(System.in);
        System.out.print("Please enter the salary: ");
        double salary = keybd.nextDouble();
        System.out.print("Please enter the amount of years: ");
        int years = keybd.nextInt();
        while (loopControl < years) {
            salary = salary * 1.1;
            System.out.println("Salary for Year " + (loopControl + 1) + " is " + salary);
            loopControl++;
        }
    }
}
