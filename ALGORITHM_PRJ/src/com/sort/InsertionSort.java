package com.sort;

public class InsertionSort {
	/**
	 * 삽입정렬
	 * 
	 * CONCEPT : 각 숫자를 적절한 위치에 삽입
	 * 			  기준 값의 위치를 설정 해주며 정렬하는 방식
	 * EXAMPLE : 1, 10, 5, 8, 7, 6, 4, 3, 2, 9
	 * TIME COMPLEXITY : O(N^2)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int j = 0;
		int temp = 0;
		
		for(int i=0;i<array.length-1;i++) {
			j = i;
			while(j>=0 && array[j] > array[j+1]) {
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--;
			}
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + ", ");
		}
	}

}
