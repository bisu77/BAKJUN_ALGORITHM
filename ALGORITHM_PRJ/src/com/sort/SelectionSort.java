package com.sort;

public class SelectionSort {
	/**
	 * 선택정렬
	 * 
	 * CONCEPT : 가장 작은 것을 선택해서 제일 앞으로 보내기
	 * 			  한 사이클 돌 때마다 맨 처음 IDX에 작은 값이 위치
	 * EXAMPLE : 1, 10, 5, 8, 7, 6, 4, 3, 2, 9
	 * TIME COMPLEXITY : O(N^2)
	 * @param args
	 */
	public static void main(String[] args) {
		int min = 0;
		int idx = 0;
		int temp = 0;
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		for(int i=0;i<array.length;i++) {
			min = 9999;
			for(int j=i;j<array.length;j++) {
				if(min>array[j]) {
					min = array[j];
					idx = j;
				}
			}
			temp = array[i];
			array[i] = array[idx];
			array[idx] = temp;
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + ", ");
		}
	}

}
