package com.alevel.homeWork4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        // Создаем и наполняем массив случайными числами от 0 до 50
        int[] array = new int[2000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        System.out.println(Arrays.toString(array));

        // Заменяем все четные числа в массиве на 0
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
