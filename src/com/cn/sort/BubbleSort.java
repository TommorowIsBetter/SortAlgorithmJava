package com.cn.sort;

import java.util.Arrays;

/**
 * 
 * @author Wang Yan
 * @date 2019年1月18日
 * @Description Sort the data with bubble sort.
 * @version 1.0.0
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {22, 18, 36, -20, 9, 100, 44}; 
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
/**
 * 
 * @param arr : the name of array which will be sorted.
 * @Description :finish the sort of the array.
 */
	public static void bubbleSort(int arr[]){
		int  i = 0, j = 0, temp = 0;
		for( i = 0; i <arr.length - 1; i++){
			for( j = 0; j < arr.length -i -1; j++){
				if(arr[j] > arr[j + 1]){
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
	}

}
