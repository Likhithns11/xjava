class Buy{
	public static void product(String brand,double price)
	{
		System.out.println("running product in Buy");
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		if(price>0 && price<=100)
		{
			System.out.println("Valid Price");
		}
		else
		{
			System.out.println("In-valid Price");
		}
	}
	public static void product(String name,int quantity,String quality,double price)
		{
		System.out.println("running product in BUy");
		System.out.println("Name:"+name);
		System.out.println("Quantity:"+quantity);
		System.out.println("Quality:"+quality);
		System.out.println("Price:"+price);
		
		if(quantity>0 && quantity<=10)
		{
			System.out.println("Valid Quantity");
		}
		else
		{
			System.out.println("In-valid Quantity");
		}
			
		
		if(price>0 && price<=3000)
		{
			System.out.println("Valid Price");
		}
		else
		{
			System.out.println("In-valid Price");
		}
			
		}
		
}




 