import java.util.Scanner;
public class Repeat {
	public static void main(String args[]){
		String str = new String();
		int b[] = new int[999];
                System.out.println("Enter a string:");
                Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		int n,i=0;
		while(i<str.length())
		{
		 n=(int)str.charAt(i);
		if(b[n]==-1)
			continue; 
		b[n]++;
                 if(b[n]>1 && b[n]!=-1)
		{
                        System.out.println((char)n);				
                        b[n]=-1;
                }i++;
		}

}
}
 
