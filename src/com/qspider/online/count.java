package com.qspider.online;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("enter the string");
		String str1=a.nextLine();
		
		System.out.println(str1.replaceAll("[^A-Z0-9a-z]", ""));
		
	
	}

	}


