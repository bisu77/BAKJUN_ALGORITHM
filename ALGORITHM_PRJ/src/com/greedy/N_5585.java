package com.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class N_5585 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		int change_money = 1000-money;
		int coin[] = {500,100,50,10,5,1};
		int mok = 0;
		int result = 0;
		
		for(int i=0;i<coin.length;i++) {
			mok = change_money / coin[i];
			result += mok;
			if(mok>0)
				change_money -= (coin[i] * mok);
		}
		
		System.out.println(result);
	}
}
