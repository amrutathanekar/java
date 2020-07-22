import java.util.Scanner;
class factorial
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = s.nextInt();
		int fact=1;
		for(int i= num;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(+num+ "of factorial is :"+fact);	
	}
}