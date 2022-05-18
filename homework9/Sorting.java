package homework.homework9;

import java.util.Arrays;

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
        int[] array = {5,8,10,1,1,20};
        sorting(array);
        for(int i = 0; i < array.length; i++) {
            System.out.printf("%d ",array[i]);
        }

    }
    }


