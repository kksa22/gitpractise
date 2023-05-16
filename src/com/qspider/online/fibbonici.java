package com.qspider.online;

public class fibbonici {
	public static void main(String[] args) {
		

		int a=0,b=1;
		
		int c;
		
		for(int i=1;i<=10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
