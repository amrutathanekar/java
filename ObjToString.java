class ObjToString
{
	String name;
	String branch;
	int roll_no;
		ObjToString(String name,String branch,int roll_no)
	{
		this.name=name;
		this.branch= branch;
		this.roll_no=roll_no;
	}
	public String toString()
	{
		return name+ " "+branch+ " "+roll_no;
	}
	public static void main(String[] args)
	{
		ObjToString obj = new ObjToString("amruta","IT",52);
		System.out.println(obj);
		
	}
}