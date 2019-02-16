package p1;

import java.util.Scanner;

public class BirthdayChocalate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int sum=0,cnt=0;
		int sum1=0;
		
		System.out.println("Enter the length of array:");
		int n1=kb.nextInt();
		
		System.out.println("Enter NO. of elements:");
		int N[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			N[i]=kb.nextInt(); 
		}
		
		System.out.println("Enter the date of month d:");
		int d=kb.nextInt();
		
		System.out.println("Enter the month m:");
		int m=kb.nextInt();
		
		
		//To check left to right consecutive No.s sum is equal to d or not
		  for(int j=0;j<m;j++) {
			sum+=N[j];
		  }
		 if(sum==d) {
			   cnt++;
			   }
		 
		 //To check right to left consecutive No.s sum is equal to d or not 
		   for(int k=N.length-m;k>0;k--) {
			  
			 sum1+=N[N.length-m]; 
		   }
		   if(sum1==d) {
			   cnt++;
		   }
		   
		   
		 System.out.println(cnt);
				  	
			}
}


