import java.util.Scanner;
class Pronic
	{
		public static void main (String[]args)
		{
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
		boolean Pronic=false;
		for (int i=1; i<input; i++)
		{
		if(i*(i+1)==input)
		{
			Pronic=true;
			break;
		}
		}
		if (Pronic==true)
		{
		System.out.println("Yes, Your number is Pronic Number ");
		}
		else
		{
		System.out.println("Sorry, Your number is Not a Pronic number");
		}
	}
	}