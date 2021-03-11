package com.alevel.homeWork4;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        // Создаем и наполняем массив, размером 1000 элементов, числами от 0 до 50
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }

    //Сортируем массив в обратном порядке с помощью метода выбора
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int maxId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = max;
            array[maxId] = temp;
        }
    }
}