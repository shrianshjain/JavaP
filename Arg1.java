import java.util.*;
class Arg1{
	public static void main(String args[])
	{
		int size = args.length;
		int count = 0;
		for(int i=0;i<size;i++)
		{
			int a = Integer.parseInt(args[i]);
			count+=a; 
		}
		System.out.print(count);
	}
}