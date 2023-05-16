package com.qspider.online;

import java.util.Iterator;
import java.util.Scanner;

public class ac {

	public static void main(String[] args) {
		
		String str1="this is a string";
		
		String rev="";
		for (int i=str1.length()-1; i>=0;i--) {
			rev=rev+str1.charAt(i);
		}
		System.out.println(rev);
	}
	
	
}
