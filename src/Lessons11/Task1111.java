package Lessons11;
// Напишите класс, который выводит в одну строку на экран 11 случайных чисел
// из диапазона "положительные" двухзначные. После каждого числа, делящегося
// на 5 без остатка, следует вывести (в обычных скобках, вплотную к числу) сумму
// его цифр, для остальных чисел следует вывести произведение его цифр (в квадратных
//        скобках вплотную к числу)


import java.util.Random;

public class Task1111 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 11; i++) {
            int randomNumber = random.nextInt(10,100);
            int one = randomNumber % 10;
            int two = randomNumber / 10;
            if ((randomNumber % 5) == 0) {
                System.out.print(randomNumber + "(" + (one + two) + ") ");
            } else {
                System.out.print(randomNumber + "[" + (one * two) + "] ");
            }
        }
    }
}
