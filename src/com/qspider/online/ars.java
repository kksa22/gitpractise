package com.qspider.online;

class student2{
	int ratings;
	String name;
	long contactnumber;
	
	student2(int ratings, String name, long contactnumber) {
		this.ratings=ratings;
		this.contactnumber=contactnumber;
		this.name=name;
	}

	public String toString() {
		return "student2 [ratings=" + ratings + ", name=" + name + ", contactnumber=" + contactnumber + "]";
	}
	
	

}
public class ars {

	public static void main(String[] args) {
		student2 [] arr= new student2[4];
		student2 s1= new student2(5,"ketan",676575757l);
		arr[0]=s1;
		arr[1]=new student2(67,"john",434543535l);
		arr[2]=new student2(45,"sam",243243243242l);
		arr[3]=new student2(34,"mike",4353535335l);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	
	}

}
