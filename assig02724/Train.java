class Train
{
	public static void book(String source,String destination)
	{
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
        System.out.println("------------------");		
	}
	
	public static void book(String source,String destination,int quantity)
	{
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("quantity:"+quantity);
		System.out.println("------------------");
	}
	
	public static void book(String source,String destination,int quantity,double price)
	{
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		System.out.println("------------------");
	}
	
	public static void cancel(double ticketNo)
	{
		System.out.println("the ticketNo:"+ticketNo+" has been canceled.");
		System.out.println("------------------");
	}
	
	public static void cancel( String source,String destination)
	{
		System.out.println("train has cancel between "+source+" and "+destination+".");
		System.out.println("=====================================================");
		
	}
}