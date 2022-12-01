package Lessons11;

import java.util.Random;

//Напишите класс, который выводит на экран (в одну строку) 19 случайных чисел
//из диапазона однозначные числа. Каждое значение равное 0 следует вывести на экран в окружении
//символов процента
public class Task1110 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 19; i++) {
            int randomNumber = random.nextInt(10);
            if (randomNumber == 0) {
                System.out.print("%" + randomNumber + "% ");
            } else {
                System.out.print(randomNumber + " ");
            }

        }
    }
}
