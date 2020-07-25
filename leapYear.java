import java.util.Scanner;
class leapYear
{   
	public int leapyear(int year)
	{
		if(year%4==0||year%400==0&&year%100!=0)
		{
			System.out.println("year is leap year");
		}
		else
		{
			System.out.println("year is not leap year");
		}
		return year;
		
	}
	public static void main(String[] args)
	{
		leapYear l = new leapYear();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the year ");
		int year = s.nextInt();
		l.leapyear(year);
		
	}
}