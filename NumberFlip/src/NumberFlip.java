import java.util.Scanner;

public class NumberFlip {
    static int flip(int originalNumber) {
        String stringOriginalNumber = Integer.toString(originalNumber);         // int переводим в String через класс обвертку- Integer и его метод- toString
        StringBuilder objectStrBuild = new StringBuilder(stringOriginalNumber);    // создаем обект objectStrBuild типа StringBuilder в конструктор влаживаем строку
        objectStrBuild.reverse();                                                // у  StringBuilder есть метод- reverse() им и воспользовались
        int flipNumber = Integer.parseInt(objectStrBuild.toString());            // переводим обьект StringBuilder в String, а потом в int через класс обвертку и его метод
        return flipNumber;
    }

    public static void main(String[] args) {
        int originalNumber;
        Scanner scan = new Scanner(System.in);

        while (true) {
            while (true) {
                System.out.println("Введите целое число, что бы получить это число с цифрами в обратном порядке:");
                if (scan.hasNextInt()) {
                    originalNumber = scan.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка ввода целого числа, проверте и повторите");
                    scan.next();
                }
            }
            System.out.println("Вы ввели число      : " + originalNumber);
            System.out.println("Инвертированое число: " + flip(originalNumber));
            System.out.println();
            System.out.println("Вы хотите продолжить с другим числом? " + "\u001B[1;32m" + "Да - любой символ / Нет - \" 0 \":" + "\u001B[0m");
            if (scan.next().equals("0")) {
                break;
            }
        }
    }
}
