import java.util.Scanner;
class Author{
	String name = new String();
	String email = new String();
	char gender;
	public Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;	
	}
	public String getName(String str)
	{	
		return str;			
	}
	public String getEmail(String etr)
	{
		return etr;		
	}
	public void setEmail(String Email)
	{	
		email = Email;		
	}
	public char getGender(char gen)
	{
		return gen;	
	} 
	public String toString()
 	{
		String s=new String("Author[name = "+name+","+"email = "+email+","+"gender = "+gender+"]");
		return s;
	}
}
class Book{
	String name = new String();
	Author author = new Author();
	double price;
	int qty = 0;
	public Book(String name,Author author,double price)
	{
		this.name=name;
		this.author=author;
		this.price=price;
	}
	public Book(String name,Author author,double price,int qty)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;		
	}
	public String getName(String str)
	{	
		return str;			
	}
	public Author getAuthor(Author atr)
	{
		return atr;
	}
	public double getPrice(double gp)
	{
		return gp;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public int getQty(int qt)
	{
		qty = qt;
	}
	
}
class New{ 
	public static void main(String args[])
	{
		String name = new String();
		String email = new String();
		char gender;
		System.out.println("Enter your Name:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter your Email:");
		Scanner rc = new Scanner(System.in);
		String etr = rc.nextLine();	
		System.out.println("Enter your Gender(M/F):");		
		Scanner bc = new Scanner(System.in);
		char gen = bc.next().charAt(0);	
		Author at = new Author(str,etr,gen);		
		name = at.getName(str);
		email = at.getEmail(etr);
		at.setEmail(email);
		gender = at.getGender(gen);
		System.out.println(at.toString());
	}	
}