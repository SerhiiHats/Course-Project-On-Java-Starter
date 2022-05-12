
import java.text.SimpleDateFormat;
import java.util.Date;

public class NumberOfDates {
    static int dateconvert(String data) {
        int digits = 0;
        String[] dataMas = data.split("/");
        for (int i = 0; i < dataMas.length; i++) {
            for (int j = 0; j < dataMas[i].length(); j++) {
                digits += dataMas[i].charAt(j) - '0';
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        String data = "02/11/1995";
        System.out.println("1. Введена дата    : " + data);
        System.out.println("1. Число этой даты : " + dateconvert(data));
        Date data1 = new Date();                                             // Создадим обект класса дата для определения текущего времени
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  // сформатируем дату конструктором в формат dd/MM/yyyy кот.был приведен как образец
        String formated = format.format(data1);                               // парсим дату в стринг для ее дальнейшего корректного отображения
        System.out.println("2. Текущая дата    : " + formated);                // выводим текущую дату в концоль
        System.out.println("2. Число этой даты : " + dateconvert(formated));
    }

}
