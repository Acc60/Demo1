package com.seleniummvn;

public class PracticeAfter {

	public void Practice () {
		System.out.println("Able to see output of method Practice After");
		
		//Swaping two numbers:
		
		int a=10,b=20;
		System.out.println("present value of a is==" + a + "  and present bvalue of b is =="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("present value of a is==" + a + "  and present bvalue of b is =="+b);
		
         a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("present value of a is==" + a + "  and present bvalue of b is =="+b);
		b=a+b-(a=b);
		
		//Reversing a number
		int n=1234;
		
		int inv=0;
		while(n!=0) {
		inv=inv*10+n%10;
		n=n/10;
		}
		System.out.println("After reversing number is =="+inv);
		n=1234;
		StringBuffer sv=new StringBuffer(String.valueOf(n));
		StringBuffer rev=sv.reverse();
		System.out.println(rev);
		
		String aa="ABCD";
		String re="";
		int l=aa.length();
		
		for(int i=l-1;i>=0;i--) {
			re=re+aa.charAt(i);
					
		}
		System.out.println("Reverse string is --"+re);
		String reverse="";
		char bb[]=aa.toCharArray();
		for(int i=l-1;i>=0;i--) {
			reverse=reverse+bb[i];
		}
		
		StringBuffer sb1=new StringBuffer(aa);
		sb1.reverse();
	}
	
	public static void main(String[] args) {
		System.out.println("Dealing with java concepts");
		
		PracticeAfter p=new PracticeAfter();
		p.Practice();
		
	}
}
