package com.cn.sort;

import java.util.Arrays;


/**
 * 
 * @author Wang Yan
 * @date 2019年1月18日
 * @Description Sort the datas with simple select sort
 * @version 1.0.0
 */

public class SimpleSelectSort {
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 22, 18, 36, -20, 9, 100, 44}; 
		simpleSelectSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * 
	 * @param arr the name of array
	 * @Description sort the array 
	 * @return the new array which has been sorted by simple select algorithm.
	 */
	public static void simpleSelectSort(int arr[]){
		int k = 0, i = 0, j = 0;
		for( i = 0; i <arr.length; i++){
		    k = i;
			for( j = k+1; j < arr.length; j++){
				if(arr[j] < arr[k]){
					k = j;
				}
			}
			if( k != i){
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
		
	}

}
