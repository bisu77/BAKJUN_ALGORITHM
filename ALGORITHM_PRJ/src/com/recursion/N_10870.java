package com.recursion;

import java.util.Scanner;

//피보나치 수열
public class N_10870 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n_fibo  = sc.nextInt();
		System.out.println(getFibo(n_fibo));
	}
	public static int getFibo(int n_fibo) {
		if(n_fibo>1)
			return getFibo(n_fibo-2) + getFibo(n_fibo-1);
		else
			return n_fibo;
	}
}
