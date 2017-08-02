import java.util.*;
public class Mincandy
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
ArrayList<Integer>list=new ArrayList<Integer>();
ArrayList<Integer>list1=new ArrayList<Integer>();
Integer n,sum=0;
System.out.println("Enter the number of childrens:");
n=s.nextInt();
Integer arr[]=new Integer[n];
System.out.println("Enter the ratings for children:");
for(int i=0;i<n;i++)
{
	arr[i]=s.nextInt();
	list.add(arr[i]);
}
int x=n;
Collections.sort(list);
for(int j=0;j<n-1;j++)
{ 	 if(list.get(j)<list.get(j+1))
		{
	        sum++;
			x +=sum;
			list1.add(x);	
		}
		} 	
Collections.sort(list1);
if(list1.isEmpty())
{
	System.out.println("Minimum candies are "+n);

}else 
	System.out.println("Minimum candies are "+list1.get(list1.size()-1));
}
}
