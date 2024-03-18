package homework;

import java.util.Scanner;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        System.out.print("Сколько упаковок яблок вы хотите убрать в коробку: ");
        double weightApples = scanner.nextFloat();
        for (int i = 0; i < weightApples; i++) {
            appleBox.addFruit(new Apple());
        }

        System.out.print("Сколько упаковок апельсинов вы хотите убрать в коробку: ");
        double weightOranges = scanner.nextFloat();
        for (int i = 0; i < weightOranges; i++) {
            orangeBox.addFruit(new Orange());
        }

        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight() + " кг");
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight() + " кг");

        System.out.println("Сравнение веса коробок: " + appleBox.compare(orangeBox));


    }
}