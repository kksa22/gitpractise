package com.qspider.online;

interface flipcart{
	
	void product();
	void order();
	void delivery();
}

class amazon implements flipcart{
	
	public void product()
	{
		System.out.println("watch");
		System.out.println("bag");
		System.out.println("shoes");
	}
	public void order() {
		System.out.println("amazon order done");
	}
	public void delivery() {
		System.out.println("amazon sent delivery boy");
	}
}
 class shopclues implements flipcart{

		public void product()
		{
			System.out.println("watch");
			System.out.println("bag");
			System.out.println("shoes");
		}
		public void order() {
			System.out.println("shopclues order done");
		}
		public void delivery() {
			System.out.println("shopclues sent delivery boy");
		}
	 
 }
 
 class flipcartapp{
	 flipcart order(char select) {
		 if(select == 'a') {
			 return new amazon();
		 }
		 else {
			return new shopclues();
		}	 
		 
	 }}
	 
class mainclass2{
	
	public static void main(String[] args) {
		flipcartapp f=new flipcartapp();
		          flipcart user= f.order('s');
		          user.delivery();
                  user.product();
                  user.order();
        
	}	 
	 
 }
 
 


