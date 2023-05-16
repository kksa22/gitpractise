package com.qspider.online;

import java.util.Arrays;
import java.util.Scanner;

class array{

	public static void main(String[] args) {
		
		Scanner a= new Scanner(System.in);
		System.out.println("enter number");
		int num1=a.nextInt();
		
		int rev=0;
		while(num1!=0) {
			rev=rev%10+1 +num1/10;
			num1=num1/10;		
		}
		System.out.println(rev);
	}}

