class Forest
{
	public static void main(String[] information)
	{

	    if (information.length==4)
		{
		    System.out.println("getting four infomations in main method");
		    String name=information[0];
		    String area=information[1];
		    String establishedYear=information[2];
		    String state=information[3];
			for(String i:information)
			{
		    System.out.println(i);
		    }
		}
		else
		{
		System.out.println(" not getting four infomations in Forest");
		}
		
	}
	
	
}