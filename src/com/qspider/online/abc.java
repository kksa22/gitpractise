package com.qspider.online;

import java.util.Scanner;

import javax.sound.sampled.ReverbType;

public class abc {

	public static void main(String[] args) {
	        
	
		String str1="Aasif Shaikh";
		
		String a[]=str1.split(" ");
		String rev="";

		for(String w:a) {
		
		String reverseword="";
		
		for(int i=w.length()-1;i>=0;i--) {
			
			reverseword=reverseword+w.charAt(i);
		}
		
		rev=rev+reverseword+" ";
		
		}
		System.out.println(rev);
		
	}}

