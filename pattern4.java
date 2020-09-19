
class pattern4
{
	public static void main(String[] args)
	{
		  
	   
		int starcount=1;
		int spacecount=3;
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<spacecount;j++)
			{
				System.out.print(" ");
			}
			spacecount--;
			for(int p=0;p<starcount;p++)
			{
				System.out.print("*");
			}
			starcount=starcount+2;
			System.out.println();
		}
		
	}

}