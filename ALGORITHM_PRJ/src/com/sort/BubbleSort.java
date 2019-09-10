package com.sort;

public class BubbleSort {
	/**
	 * 버블정렬
	 * 
	 * CONCEPT : 옆에 있는 값끼리 비교해서 작은 값을 교차
	 * 			  한 사이클 돌 때마다 맨 마지막 IDX에 큰 값이 위치
	 * EXAMPLE : 1, 10, 5, 8, 7, 6, 4, 3, 2, 9
	 * TIME COMPLEXITY : O(N^2)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int temp = 0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<(array.length-1)-i;j++) {
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + ", ");
		}
	}
}