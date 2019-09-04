package com.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class N_10610 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total = 0;//입력받은 문자열의 합
		String result = "";
		
		String strNum = sc.nextLine();
		char[] chrNum = strNum.toCharArray();
		char[] descCharNum = new char[chrNum.length];
		
		Arrays.sort(chrNum);//오름차순 정렬
		
		for(int i=(chrNum.length-1), j=0;i>=0;i--,j++) {
			descCharNum[j] = chrNum[i];
			total += chrNum[i] -'0';
		}// 내림차순 정렬 & 입력받은 문자열의 합계 계산
		
		result = String.valueOf(descCharNum);//내림차순 정렬 값 세팅
		
		if(!strNum.contains("0") || total % 3 != 0) {
			result = "-1";
		}//입력 값 중에 0이 포함되어있지 않거나 입력받은 합계 값이 3의 배수가 아니면 -1 처리
		
		System.out.println(result);
	}
}