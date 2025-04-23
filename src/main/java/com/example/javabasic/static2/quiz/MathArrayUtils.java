package com.example.javabasic.static2.quiz;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int sum(int[] array){
        int totalSum = 0;
        for (int i : array) {
            totalSum += i;
        }
        return totalSum;
    }

    public static double average(int[] array){
        double totalAvg = sum(array)/(array.length);
        return totalAvg;
    }

    public static int min(int[] array){
        int min = array[0];
        for (int i : array) {
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    public static int max(int[] array){
        int max = array[0];
        for (int i : array) {
            if(i > max){
                max = i;
            }
        }
        return max;
    }



}
