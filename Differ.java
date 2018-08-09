import java.util.*;
class Differ{
	public static void main(String args[])
	{
		int[] arr = new int[5];
		int i;
		Scanner sc = new Scanner(System.in);
		for(i=0;i<5;i++)
		arr[i] = sc.nextInt();
		int max = arr[0];
		int min = arr[0];
		//int ind = 0;
		for(i=0;i<arr.length-1;i++)
			if(arr[i]<=min)
				min=arr[i];
			
		System.out.println("min="+min);
		for(i=0;i<arr.length;i++)
			if(arr[i]>min)
				max = arr[i];
		System.out.println("max="+max);	
		int dif = max-min;
		System.out.print("Differnce="+dif);
	}
}