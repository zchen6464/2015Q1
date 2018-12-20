package com.company;

public class DiverseArray {

    public static int arraySum(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] rowSums(int[][] arr)
    {
        int[] sumArr = new int[arr[0].length];
        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++)
            {
                sum += arr[i][j];
            }
            sumArr[i] = sum;
        }
        return sumArr;
    }

    public static boolean isDiverse(int[][] arr){

        int [] sumArr = rowSums(arr);

        for(int i = 0; i < sumArr.length; i++){

            for(int j = i+1; j < sumArr.length; j++){

                if(sumArr[i] == sumArr[j]){

                    return false;
                }
            }
        }  return true;
    }

}
