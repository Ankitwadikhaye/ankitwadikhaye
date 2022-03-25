package com.company;

import java.util.Scanner;

public class ArrSort {
    public static void main(String[] args){
        int n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values for array:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted values are as follows :");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[n - 1]);
    }
}
