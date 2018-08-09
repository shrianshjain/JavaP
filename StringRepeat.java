import java.util.*;
class StringRepeat{
	public static void main(String args[])
	{
		String str = new String();
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		char str1[] = str.toCharArray();
		int count=1;
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i+1]=='\0')
			{	
				count=0;
				count++;
				System.out.println(str1[i]+" "+count);
			}
			else if(str1[i]==str1[i+1]&&count==1)
			{	
				count++;
				System.out.println(str1[i]+" "+count);
			}
			else if(str1[i]==str1[i+1]&&count>1)
				count++;				
			else
				count=1;
			
		}
	}
}