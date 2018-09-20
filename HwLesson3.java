/**
 * Java.1.Lesson.3.Homework
 *
 * @autor Stanislav Lyashov
 */

import java.util.Random;
import java.util.Scanner;

public class HwLesson3 {
    public static void main(String[] args) {
        int rep, orderInt, inputInt;
        do {
            //загадываем число
            orderInt = addAnyInt();
            System.out.println("Угадайте число от 0 до 9");
            Scanner sc = new Scanner(System.in);
            //даем три попытки
            for (int i = 0; i < 3; i++) {
                inputInt = sc.nextInt();
                if (inputInt == orderInt) {
                    System.out.println("Вы выйграли!");// если угадали
                    break;
                } else if (i != 2) {
                    compareInt(inputInt, orderInt);
                } else System.out.println("Вы проиграли!"); //если третий ввод и не угадали
            }
            System.out.println("Загаданное число " + orderInt);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            rep = sc.nextInt();
            //если не понятно что ввели
            while (rep != 1 && rep != 0) {
                System.out.println("Не корректный ввод! \nПовторить игру еще раз? 1 – да / 0 – нет");
                rep = sc.nextInt();
            }
        } while (rep == 1);
    }

    public static int addAnyInt() {
        //создаем случайное число
        Random rand = new Random();
        return rand.nextInt(10);
    }

    public static void compareInt(int inputInt, int orderInt) {
        //сравним ввод два числа
        if (inputInt > orderInt) {
            System.out.println("Ввели большее число");
        } else System.out.println("Ввели меньшее число");
    }
}
