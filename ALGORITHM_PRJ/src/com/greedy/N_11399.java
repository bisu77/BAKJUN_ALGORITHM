package com.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class N_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int people_cnt  = sc.nextInt();
		int people_time[] = new int[people_cnt];
		int result = 0;
		int pre = 0;
		
		for(int i=0;i<people_cnt;i++) {
			people_time[i] = sc.nextInt();
		}
		
		Arrays.sort(people_time);//오름차순 정렬
	
		for(int i=0;i<people_cnt;i++) {
			result += pre+people_time[i];
			pre += people_time[i];
		}//(1)+(1+2)+(1+2+3)+(1+2+3+3)+(1+2+3+3+4)
		 
		System.out.println(result);
	}
}
