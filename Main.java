import java.util.Scanner;

public class Main {

    public static int sum (int number1, int number2) {
        return number1 + number2;
    }

    public static void sum2 (int number1, int number2) {
        System.out.println("Summe: " + sum(number1, number2));
    }

    public static void printInput (int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        System.out.println(sum(num1, num2));

        int num3 = 30;
        int num4 = 40;
        sum2(num3, num4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Nummer ein und drücken Sie ENTER:");
        int input = scanner.nextInt();
        System.out.println("Geben Sie eine zweite Nummer ein und drücken Sie ENTER:");
        int input2 = scanner.nextInt();
        printInput(input, input2);
    }
}
