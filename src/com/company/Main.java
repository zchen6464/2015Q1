package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[][] arr1 = {{3,6,7,3},{2,5,6,3},{3,6,2,11},{12,1,3,5}};
        int[][] arr2 = {{1,1,1,1},{1,1,1,1},{1,2,1,1},{1,1,3,4}};

        System.out.println("Sum: " + DiverseArray.arraySum(arr));
        System.out.println("Arr1 Sums: " + Arrays.toString(DiverseArray.rowSums(arr1)));
        System.out.println("Is Arr1 diverse: " + DiverseArray.isDiverse(arr1));
        System.out.println("Arr2 Sums: " + Arrays.toString(DiverseArray.rowSums(arr2)));
        System.out.println("Is Arr2 diverse: " + DiverseArray.isDiverse(arr2));
    }


}
