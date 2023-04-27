import java.util.*;
import java.util.IntSummaryStatistics;

import static java.util.Collections.list;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int num = in.nextInt();
        ex01(num);
        System.out.println("Задача №2: ");
        System.out.println("Сформированный массив: ");
        ex02();
        System.out.println("Задача №3: ");
        ex03(num);
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
        System.out.println(" ");
        }

    static void ex02() {

        /*
         Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое
         из этого списка. Collections.max()
         */

        Random rnd = new Random();
        ArrayList<Integer> arrlst = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrlst.add(rnd.nextInt(0, 10));
        }
        IntSummaryStatistics statistics = arrlst
                .stream()
                .mapToInt(num -> num)
                .summaryStatistics();

        System.out.println(Arrays.toString(arrlst.toArray()));
        int max = Collections.max(arrlst);
        int min = Collections.min(arrlst);
        double sum = statistics.getAverage();

        System.out.printf("Максимальный элемент: %d\n", max);
        System.out.printf("Минимальный элемент: %d\n", min);
        System.out.printf("Среднее арифметическое: %.1f\n", sum);
        System.out.println(" ");
    }

    static void ex03(int num){

        /*
        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке.
        */

        Random random = new Random();
        String[] list = {"Меркурий","Венера","Земля","Марс","Юпитер","Сатурн","Уран","Нептун"};
        List<String> newList = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            newList.add(list[random.nextInt(list.length)]);
        }
        System.out.println("Список планет с повторениями: " + newList);
        for (int i = 0; i < list.length; i++) {
            int count = Collections.frequency(newList, list[i]);
            System.out.println((i) + " " + list[i] + " встречается " + count + " раз.");
            }
        }
    }


