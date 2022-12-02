package Lessons11;

import java.util.Scanner;

//  Напишите класс, который принимает с клавиатуры целое положительное число,
//  а затем выводит на экран все целые положительные двузначные числа,
//  сумма цифр которых равна введенному с клавиатуры значению.
public class Task1113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число - ");
        int randomNumber = scanner.nextInt();
        for (int i = 10; i < 100; i++) {
            int one = i % 10;
            int two = i / 10;
            if (randomNumber == (one + two)) {
                System.out.println("Положительное двухзначное число, сумма цифр которого равна" +
                        "введенному с клавиатуры числу - " + i);
            }
        }
    }
}
