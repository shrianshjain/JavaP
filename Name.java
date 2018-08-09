import java.util.*;
class Student{
	int var=12;		
}

class Name extends Student{
	int var=20;	
	void sett()
	{
		System.out.println(super.var +" "+ var);			
	}
public static void main(String args[]){
	Name a = new Name();
//Scanner sc=new Scanner(System.in);
 //int r=sc.nextInt();
	a.sett();	
}
}