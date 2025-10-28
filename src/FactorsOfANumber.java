import java.util.Scanner;

public class FactorsOfANumber {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("This program will find factors of a number.");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int factors = 2;
        for (int i = 2; i <= Math.sqrt(number); i++) {

            if(number%i==0) {
                if(i==Math.sqrt(number)) factors +=1;
                else factors += 2;
            }
        }
        System.out.println("Total number of factors: "+factors);


    }
}