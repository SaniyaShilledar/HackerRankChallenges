
import java.util.Scanner;
import java.util.*;
public class Roops {

	public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter a string"); 
	StringBuffer s=new StringBuffer(kb.nextLine());

	if(s.length()==1) {
		System.out.println("string is:"+s);
		System.exit(0);
	}
	
		if(s.length()!=0||s.length()<2) {
			while(s.length()!=0) {
			for (int i = 0; i < s.length() - 1; i++) {
				
				if (s.charAt(i) == s.charAt(i + 1)) {
					s.delete(i, i + 2);
					System.out.println(s);
					i=0;
				}
			
			 if (s.length()==0) {
					System.out.println("Empty string");
				      }
			
		}
		}
		}
			
	}
				
				} 


	
		


