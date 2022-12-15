import java.util.Scanner;
class temp
	{
		public static void main(String[]args)
		{
			int a[][]=new int[2][7];
			Scanner sc=new Scanner(System.in);
			float Avg=0;
			int sum=0;
			for(int i=0; i<a.length; i++)
			{
				if(i==0)
				{System.out.println("Thoothukudi Temperature From ");}
				else
				{System.out.println("Tirunelveli Temperature From ");}
				for(int j=0; j<a[i].length; j++)
				{
					System.out.println("Day No."+(j+1));
					a[i][j]=sc.nextInt();
					
					
				}
			}		
			
				
			System.out.println();
			System.out.println("Temperature of two cities");
			for(int i=0; i<a.length; i++)
			{
				if(i==0)
				{System.out.println("Week Temperature of Thoothukudi : ");}
				else
				{System.out.println("Week Temperature of Tirunelveli  :");}
				for(int j=0; j<a[i].length; j++)
				{
					System.out.print(a[i][j]+"   ");
				}
				System.out.println();
			}
			
		}
	}
	
		