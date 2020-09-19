class pattern5
{
	public static void main(String[] args)
	{
		int spacecount=4;
		int starcount=1;
		int spacecount1=2;
			int starcount1=3;
		for(int i =0;i<4;i++)
		{
			for(int j=0;j<spacecount;j++)
			{
				System.out.print(" ");
				
			}
			spacecount--;
			
			for(int p=0;p<starcount;p++)
			{
				System.out.print("* ");
				
			}
			
			starcount++;
			System.out.println();
		}
		for(int i=0;i<4;i++)
		{			
			
			for(int s=0;s<spacecount1;s++)
			{
				System.out.print(" ");
			}
			spacecount1++;
			for(int k=0;k<starcount1;k++)
			{
				System.out.print("* ");
			}
			starcount1--;
			System.out.println();
		}	
			
						
		
		
	}
}