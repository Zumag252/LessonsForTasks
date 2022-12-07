package Lessons11;
//       Напишите класс, который вначале принимает с клавиатуры целое положительное число.
//        Затем класс выводит на экран в строку положительные трехзначные
//        числа, в которых последняя цифра такая же, как и последняя цифра в
//        значении, введенном с клавиатуры. Числа должны отделяться друг от
//        друга знаком «пробел». Перед началом и после окончания вывода серии
//        чисел на экран вывода следует вывести текстовые сообщения (по выбору).

import java.util.Scanner;

public class task1114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное двухзначное число - ");
        int randomNumber = scanner.nextInt();
        int lastNumberOfRandom = randomNumber % 10;
        System.out.println("Начало выборки чисел:");
        for (int i = 100 + lastNumberOfRandom; i < 990 + lastNumberOfRandom; i+=10) {
            System.out.print(i + " ");
        }
        System.out.println("Конец выборки");
    }
}
