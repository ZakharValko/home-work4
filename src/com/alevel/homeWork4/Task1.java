package com.alevel.homeWork4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        // Создаем и наполняем массив случайными числами от 0 до 50
        int [] array = new int[400];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }

        // Находим сумму значений массива
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        //Находим среднее арифметическое массива
        int avarageArithmetic = sum/array.length;
        System.out.println(avarageArithmetic);

        // Находим среднее геометрическое. Число будет равняться 0, так как при перемножении, мы получаем слишком большое число.
        long multiplySum = 1;
        for(int i = 0; i < array.length; i++) {
            multiplySum = multiplySum * array[i];
        }
        int avarageGeometric = (int) Math.sqrt(multiplySum);
        System.out.println(avarageGeometric);
    }
}
