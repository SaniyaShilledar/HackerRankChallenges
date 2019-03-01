import java.util.Scanner;
public class ProjectString {
public static void main(String []args) {
Scanner kb=new Scanner(System.in);
  System.out.println("Enter the length of the string");
    int n=kb.nextInt();
kb.nextLine();
System.out.println("Enter password:");
String str=kb.next();
 
int i;
int intcnt=0;
int upcnt=0;
int lowcnt=0;
int spclcnt=0;

if(n<8)
{
	System.out.println("Password should be 8 characters");
    System.exit(0);
}

for(i=0;i<str.length();i++)
      {
	if((str.charAt(i)>=47&&str.charAt(i)<=58)) 
		intcnt++;
       } 

for(i=0;i<str.length();i++) {
	if((str.charAt(i)>=64&&str.charAt(i)<=90)) 
		upcnt++;
		}

for(i=0;i<str.length();i++) {
	    if((str.charAt(i)>=97&&str.charAt(i)<=122)) 
		lowcnt++;
		}

for(i=0;i<str.length();i++) {
		    if((str.charAt(i)>=32&&str.charAt(i)<=45))	
			spclcnt++;
	    }

if((intcnt>=1)&&(upcnt>=1)&&(lowcnt>=1)&&(spclcnt==0))
	{
		System.out.println("Password is weak");
	
	       }

 if((upcnt>=1)&&(lowcnt>=1)&&(spclcnt>=1)&&(intcnt==0))
	         {
		System.out.println("We can make Password strong by adding 1 more character");
		
	         }
	             
  if((intcnt>=1)&&(upcnt>=1)&&(lowcnt>=1)&&(spclcnt>=1))
                  {   
	            System.out.println("Password is strong");
                    }
      else
     {  
	System.out.println("Password should have atleast 1 uppercase and lower char,1 num and 1 spcl char");
	  }


}
}

