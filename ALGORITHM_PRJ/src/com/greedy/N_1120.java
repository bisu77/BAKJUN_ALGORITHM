package com.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class N_1120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split(" ");
		
		char[] str1 = str[0].toCharArray();
		char[] str2 = str[1].toCharArray();
		
		int dif_length = str2.length - str1.length;//문자열 길이 차이
		int space_idx[] = new int[dif_length+1];//비교 할 spcae idx추가
		
		for(int i=0;i<=dif_length;i++) {
			for(int j=0;j<str1.length;j++) {
				if(str1[j]!=str2[i+j]) {//각 위치에서의 불일치 값 확인
					space_idx[i]++;
				}
			}
		}
		
		Arrays.sort(space_idx);
		
		result = space_idx[0];
		
		System.out.println(result);
	}
}
