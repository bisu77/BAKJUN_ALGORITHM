package com.greedy;

import java.util.Scanner;

public class N_2875 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int g_student 	= sc.nextInt();//여학생
		int m_student 	= sc.nextInt();//남학생
		int i_student 	= sc.nextInt();//인턴참가학생
		int result 		= 0;//결과
		int ng_student  = 0;//남은여학생
		int nm_student  = 0;//남은남학생
		int n_student	= 0;//남은학생
		int team		= 0;//team
		
		//대회 team 계산
		team = g_student / 2;
		if( m_student < team ) 
			team = m_student;
		
		//남은 학생 계산
		nm_student = m_student - team;
		ng_student = g_student - (team*2);
		n_student  = nm_student + ng_student;
		
		//결과계산
		result = team;//2
		if(i_student>n_student) {//인턴참가학생 > 남은학생
			i_student = i_student - n_student;
			//남은 인턴참가학생이 3의 배수가 아니면 1팀 감소
			i_student = (i_student % 3) == 0 ? (i_student / 3) : (i_student / 3)+1;
			result = team-i_student;
		}
		
		System.out.println(result);
	}
}
