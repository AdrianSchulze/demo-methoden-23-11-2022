import java.util.Scanner;

public class Main {
    public static void printInput (int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Die Summe der eingegebenen Zahlen beträgt: " + sum);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Nummer ein und drücken Sie ENTER:");
        int input = scanner.nextInt();
        System.out.println("Geben Sie eine zweite Nummer ein und drücken Sie ENTER:");
        int input2 = scanner.nextInt();
        printInput(input, input2);
    }
}
