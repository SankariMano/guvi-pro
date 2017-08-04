import java.util.*;
public class Step {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	  Integer n,x,y,z,a,b,ans,ans1;
	  n=sc.nextInt();
	 Integer arr[]=new Integer[n];

	 for(int i=0;i<n;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 for(int i=0;i<n;i++)
	 {
		
		 a=arr[i]/100;
		 b=arr[i]%100;		
		 ans1=(b-a)-2;
		 if(ans1>1)
		 System.out.println((ans1/2)+(ans1%2)+2);
		 else
			 System.out.println(ans1+2);
	 }
   }	 
   }
