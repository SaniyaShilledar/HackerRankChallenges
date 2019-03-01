import java.util.Scanner;

public class MarsHackerrank {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=kb.nextLine();
	int cnt=0;
		char[] c=str.toCharArray();
		for(int i=0;i<str.length();i+=3) {
			if(c[i]!='S') 
				cnt++;
			if(c[i+1]!='O') 
				cnt++;
			
			if(c[i+2]!='S') 
				cnt++;
			
			
		}
		System.out.println(cnt);
		

	}

}
