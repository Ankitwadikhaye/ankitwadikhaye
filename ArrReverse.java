package com.company;

import java.util.Scanner;

public class ReverseArr {
    public void reverse(int arr[]){
        int x = arr.length;
        for(int i=x-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int len = sc.nextInt();
        int[] array = new int[len];
        System.out.println("enter value for the array");
        for(int i =0;i<len;i++){
            array[i] = sc.nextInt();
        }
        ReverseArr ob = new ReverseArr();
        ob.reverse(array);

    }
}
