import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int num = in.nextInt();
        ex01(num);
        ex02(num);
        ex03();
    }

    static void ex01(int num){

        // Пусть дан произвольный список целых чисел, удалить из него четные числа

        Integer[] randomArr = new Integer[num];
        Random rndGen = new Random();
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = rndGen.nextInt(100);
        }
        System.out.println("Исходный массив: " + Arrays.toString(randomArr));

        Integer[] newArr = new Integer[num];
        for (int i = 0; i < randomArr.length; i++) {
            if (randomArr[i] % 2 != 0 && randomArr[i] != 0) {
                newArr[i] = randomArr[i];
            }
        }
        newArr = Arrays.stream(newArr).filter(Objects::nonNull).toArray(Integer[]::new);
        System.out.println("Обработанный массив: " + Arrays.toString(newArr));
        }


    static List<Integer> ex02(int num){

        /*
         Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое
         из этого списка. Collections.max()
         */

        List<Integer> list = new ArrayList<>(num);

        for (int i = 0; i < num; i++) {
            list.add((int)(Math.random()));
        }
        return list;

        int max = Collections.max();
        int min = Collections.min(list);
        System.out.println("Обработанный массив: " + Collections.max(list),Collections.min(list));





    }

    static void ex03(){

        /*
        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке.
         */

    }
}
