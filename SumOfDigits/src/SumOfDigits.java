import java.util.Scanner;

public class SumOfDigits {
    static int digits(int number) {
        int sumDigits = 0;
        if (number < 0) {
            number *= -1;
        }
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++) {
            sumDigits += str.charAt(i) - '0';
        }
        return sumDigits;
    }

    public static void main(String[] args) {
        int firstNumber;
        Scanner scan = new Scanner(System.in);

        while (true) {
            while (true) {
                System.out.println("Введите целое число, что бы получить сумму цифр данного числа:");
                if (scan.hasNextInt()) {
                    firstNumber = scan.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка ввода целого числа, проверте и повторите");
                    scan.next();
                }
            }
            System.out.println("Вы ввели число: " + firstNumber);
            System.out.println("Сумма цифр числа: " + digits(firstNumber));
            System.out.println();
            System.out.println("Вы хотите продолжить с другим числом? " + "\u001B[1;32m" + "Да - любой символ / Нет - \" 0 \":" + "\u001B[0m");
            if (scan.next().equals("0")) {
                break;
            }
        }
    }
}