package com.recursion;

import java.util.Scanner;

public class N_10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n_factorial  = sc.nextInt();
		if(n_factorial==0)
			System.out.println(1);
		else
			System.out.println(getFactorial(n_factorial));
	}
	
	public static int getFactorial(int n_factorial) {
		if(n_factorial>1)
			return getFactorial(n_factorial-1) * n_factorial;
		else
			return n_factorial;	
	}
}
