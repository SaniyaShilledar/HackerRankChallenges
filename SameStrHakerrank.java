import java.util.Scanner;
public class SameStrHakerrank {

	public static void main(String[] args) {
 String s1="hackerrank";
 Scanner kb=new Scanner(System.in);
 System.out.println("Enter the string count:");
 int n=kb.nextInt();
 kb.nextLine();
 System.out.println("Enter a string:");
String s[]=new String[n];
for(int m=0;m<n;m++)
    {
            s[m]=kb.nextLine();
      }
 String temp="";
 String t="";
 
 for(int l=0;l<n;l++) {
 	 
       for(int i=0;i<s1.length();i++)
         {
	   for(int j=0;j<s[l].length();j++) {
		if(s1.charAt(i)==s[l].charAt(j))
		{
			t+=s[l].charAt(j);
			break;
		}
	
	   }
     }
  
 	    for(int i=0;i<s1.length();i++) {
		  for(int j=0;j<t.length();j++) {
		  if(s1.charAt(i)==t.charAt(j)) {
		  temp+=t.charAt(j);
		  break;
		  }
		  }
	    }
		  

  if(s1.equals(t)) {
	  System.out.println("Yes");
  }
  else
  {
	  System.out.println("No");
  }
  
	}
	}

}
