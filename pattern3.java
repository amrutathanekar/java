import java.util.Scanner;
class pattern3
{
	public static void main(String[] args)
	{   
	    Scanner s= new Scanner(System.in);
		int no = s.nextInt();
		int starcount=1;
		int spacecount=no-1;
		
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<spacecount;j++)
			{
				System.out.print(" ");
			}
			Spacecount--;
			for(int p=0;p<starcount;p++)
			{
				System.out.print("*")
			}
			starcount=starcount+2;
			System.out.println();
		}
		
	}
}