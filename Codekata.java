import java.io.*;
public class Codekata 
{
public static void  main(String args[]) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	 
	 String a=br.readLine();
	 String a1=br.readLine();
	Character arr[]=new Character [a1.length()];
	char c,d;
	 for (int i=0;i<a.length();i++)
	 {		
			 arr[i]=(char) (a.charAt(i)+10);
			 System.out.print(arr[i]);
	 } 
		 System.out.print(" "+a1.charAt(0)+((char)(a1.charAt(1)+10))+(char)((a1.charAt(2)+10-122)+96)+a1.charAt(3));
	}
}
