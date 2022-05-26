package homework.homework9;

import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static void sorting(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = new int [1000000];
        Random random = new Random();
             for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();}
        long starTime1 = System.currentTimeMillis();
        sorting(array);
        long endTime1 = System.currentTimeMillis();
        System.out.println("Сортирвка вставками: " + (endTime1 - starTime1));
        long starTime2 = System.currentTimeMillis();
        Arrays.sort(array);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Встроенный алгоритм: " + (endTime2 - starTime2));
    }
    }


