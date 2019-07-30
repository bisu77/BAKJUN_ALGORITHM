package com.greedy;

import java.util.Scanner;

public class N_11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int money = sc.nextInt();
		int result = 0;
		int mok = 0;
		
		int coin[] = new int[cnt];
		for(int i=0;i<cnt;i++) {
			coin[i] = sc.nextInt();
		}
		
		for(int i=(cnt-1);i>=0;i--) {//큰 코인으로 금액을 나눈 몫을 더한다.
			mok =  money / coin[i];
			money = money-(coin[i]*mok);
			result += mok;
		}
		System.out.println(result);
	}

}
