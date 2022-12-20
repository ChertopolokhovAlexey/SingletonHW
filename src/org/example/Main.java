package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запуск программы");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        System.out.println("Добрый вечер.");

        int listSize;
        int randomLimit;
        int treshold;


logger.log("Работаем с пользователем.");
        while (true) {
            System.out.println("Введите два числа.Размер и макс величину массива через пробел.");
            String[] input = (scanner.nextLine()).split(" ");
            if (input.length != 2) {
                logger.log("Пользователь ввел неверные данные.");
                System.out.println("Нужно вводить два числа через пробел!");
                continue;
            }
            System.out.println("Введите порог для фильтра");
            String filterValue = scanner.nextLine();
            try {
                listSize = Integer.parseInt(input[0]);
                randomLimit = Integer.parseInt(input[1]);
                treshold = Integer.parseInt(filterValue);

            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод");
                continue;
            }
            for (int i = 0; i < listSize; i++) {
                list.add(random.nextInt(randomLimit));
            }
            break;
        }
        logger.log("Выводим список случайных чисел по заданным параметрам");
        System.out.println("Список случайных чисел" + list);
        logger.log("Производим проверку списка.");
        Filter filter = new Filter(treshold);
        list = filter.filterOut(list);
        logger.log("Выводим результат фильтрации");
        System.out.println(list);
        logger.log("Finish");

    }


}
