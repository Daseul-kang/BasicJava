package chapter05;

import java.util.Random;

public class note {

    Random random = new Random();
    
    public static void main(String[] args) {
        int[] arr = {4, 6, 43, 7, 24, 6, 2, 6};

        //int max = MAX(arr);

        //System.out.println(max);
    }

    /////////////////////////////////////////////////////////////////////
    // 중복제거 함수
    public boolean isContains(int[] arr, int target)
    {
        boolean isContains = false;

        for (int i = 0; i < arr.length; i++)
        {
            if (target == arr[i]) {
                isContains = true;
                break;
            }
        }
        return isContains;
    }


    public void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public int MAX(int[] arr)
    {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
}
