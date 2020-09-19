class patter2
{
	public static void main(String[] args)
	{
		int spacecount=3;
		int starcount=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<spacecount;j++)
			{
				System.out.print(" ");
			}
			spacecount--;
			for(int p=0;p<starcount;p++)
			{
				System.out.print("* " );
			}
			starcount++;
			System.out.println();
		}
	}
}