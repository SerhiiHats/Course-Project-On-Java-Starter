import java.util.Scanner;

public class NameNumber {
    static int nameToNumber(char charName) {
        char[] charAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < charAlphabet.length; i++) {
            if (charName == charAlphabet[i] || charName == Character.toUpperCase(charAlphabet[i])) {
                return (i + 1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int sumName;
        Scanner scan = new Scanner(System.in);
        while (true) {
            sumName = 0;
            System.out.println("Введите имя в английском алфавите, а на виход получите число имени: ");
            String strName = scan.next();
            for (int i = 0; i < strName.length(); i++) {
                sumName += nameToNumber(strName.charAt(i));
            }
            System.out.println(strName + " = " + sumName + " - это число Вашего имени");
            System.out.println("Вы хотите продолжить с другим Именем? " + "\u001B[1;32m" + "Да - любой символ / Нет - \" 0 \":" + "\u001B[0m");
            if (scan.next().equals("0")) {
                break;
            }
        }
        scan.close();
    }
}
