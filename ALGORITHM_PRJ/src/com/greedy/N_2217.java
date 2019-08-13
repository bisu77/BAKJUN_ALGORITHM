package com.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class N_2217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int lope_cnt 		= sc.nextInt();
		int[] lope_weight 	= new int[lope_cnt];
		int max = 0;
		
		for(int i=0;i<lope_cnt;i++) {
			lope_weight[i] = sc.nextInt();
		}
		
		Arrays.sort(lope_weight);

		max = lope_weight[lope_cnt-1];//제일 중량이 큰 밧줄의 최대값
		
		for(int i=0;i<lope_cnt;i++) {//중량을 나눴을 때의 최대 값
			if(max < (lope_weight[i]*(lope_cnt-i)) ) max = lope_weight[i]*(lope_cnt-i);
		}
		
		System.out.println(max);
	}
}
