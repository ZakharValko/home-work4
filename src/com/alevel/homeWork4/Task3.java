package com.alevel.homeWork4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        // Создаем и наполняем массив случайными числами от 0 до 50
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }

        // Находим составные числа в массиве и считаем их количество
        int counter = 0;
        for (int i = 0; i<array.length; i++) {
            for (int j = 2; j<array[i]; j++){
                if(array[i] % j == 0) {
                    counter = counter + 1;
                    break;
                }
            }
        }
        System.out.println(counter);
    }
}