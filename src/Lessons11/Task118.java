package Lessons11;
// Напишите класс, который выводит на экран (в одну строку) 15 случайных чисел
//  из диапазона -20 до +35. После каждого отрицательного числа
//  следует вывести (вплотную к числу) символ«?» (знак вопроса).

import java.util.Random;

public class Task118 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            int randomInt = random.nextInt(-20, 35);
            if (randomInt < 0) {
                System.out.print(randomInt + "? ");
            } else {
                System.out.print(randomInt + " ");
            }
        }
    }
}
