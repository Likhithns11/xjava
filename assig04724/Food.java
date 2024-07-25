class Food{
	public static void buyEgg(int total,double pricePerEgg)
	{
		System.out.println("running buyEgg in Food");
		System.out.println("total eggs:"+total);
		System.out.println("price per egg:"+pricePerEgg);


        if(total>0 && total<=100)
		{
			System.out.println("Valid Quantity");
		}
		else
		{
			System.out.println("In-valid Quantity");
		}
		
		if(pricePerEgg>0 && pricePerEgg<=6)
		{
			System.out.println("Valid price ");
		}
		else
		{
			System.out.println("In-valid price");
		}		
	}
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
	{
		System.out.println("running buyShampoo in Food");
		System.out.println("net weight in ml:"+quantityInMl);
		System.out.println("price per packet:"+price);
		System.out.println("brand name of shampoo:"+brand);
		System.out.println("date of manufacture:"+manfDate);
		



        if(quantityInMl>0 && quantityInMl<=5)
		{
			System.out.println("Valid Quantity");
		}
		else
		{
			System.out.println("In-valid Quantity");
		}
		
		if(price>0 && price<2)
		{
			System.out.println("Valid price ");
		}
		else
		{
			System.out.println("In-valid price");
		}		
	}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity)
	{
		System.out.println("running buyCake in Food");
		System.out.println("size:"+size);
		System.out.println("type of cake:"+type);
		System.out.println("flavour:"+flavour);
		System.out.println("cost of cake:"+cost);
		System.out.println("quantity in KG:"+quantity);
		
	
        if(cost>0.0 && cost<=800.0)
		{
			System.out.println("Valid cost");
		}
		else
		{
			System.out.println("In-valid cost");
		}
		
		if(quantity>0 && quantity<=10)
		{
			System.out.println("Valid quantity ");
		}
		else
		{
			System.out.println("In-valid quantity");
		}		
	}
	
	
}