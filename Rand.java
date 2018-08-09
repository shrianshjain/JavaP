import java.util.*;
class Rand{
	public int randInt(int min,int max)
	{
		Random rand = new Random();
		int rNum = rand.nextInt((max-min)+1)+min;
    		return rNum;
	}
	public static void main(String args[]){
		int max = 26,min = 1;
		Rand r = new Rand();
		int rn = r.randInt(min,max);
		char ch = (char)(rn+64);
		int key = (rn+2)/3+1;
		if(rn==21-2||rn==28-2||rn==24-2||rn==25)
		key--;
		System.out.println("Number generated : "+rn);
		System.out.println("Converted Letter : "+ch);
		System.out.println("Keypad number : "+key);			 	 
		}
}