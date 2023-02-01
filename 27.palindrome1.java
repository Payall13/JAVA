//palindrome no
import java.util.*;
 class palindrome1
 {
	 public static void main(String args[])
	 {
		 int n,r,s=0,i;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter n");
		 n=sc.nextInt(); 
		 i=n;
		 while(n>0)
		 {
			r=n%10;
			s=s*10+r;
			n=n/10;
		 }
		 if(s==i)
			 System.out.println("palindrome");
		 else
			 System.out.println("not ");
	 }
 }
 
 
   
