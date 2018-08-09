import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		String a = new String();
		char[] b=new char[999];
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		int x = a.length();
		char[] ch = a.toCharArray();
		int j=0,count=0,n;
		n=count;
		int i=0;
		int k=0;
		while(i<x)
		{
			if(ch[i] == ' ')
			{
				j=i-1;
				while(j != n)
				{
					b[k]=ch[j];
					k++;
					j--; 
				}
				//n=count;
			}
		  count++;		
		  i++;
		}
		for(i =b.length-1;i>=0;i--)
			System.out.print(b[i]);		
	}
}
