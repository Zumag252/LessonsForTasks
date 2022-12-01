package Lessons11;
import java.util.Random;

// Напишите класс, который выводит на экран (в одну строку) 20 случайных
// чисел из диапазона 27
// до 73. Перед каждым значением, делящимся на 3
// без остатка, следует вывести (вплотную к числу) символ «#» (решетка).

public class Task119 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(27,73);
            if ((randomNumber % 3) == 0) {
                System.out.print("#" + randomNumber + " ");
            } else {
                System.out.print(randomNumber + " ");
            }
        }
    }
}

