package com.qspider.online;

import java.util.Iterator;

public class secondlargest {

	public static void main(String[] args) {
		
		int temp;
		int[] a={8,3,0,2,1,5,3};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}
System.out.println("seccond largest "+a[1]);
		
	}

}
