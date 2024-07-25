class Laptop{
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
	{
		System.out.println("running buyLaptop in Laptop");
		System.out.println("Brand:"+brand);
		System.out.println("serialNo:"+serialNo);
		System.out.println("price:"+price);
		System.out.println("battery Capacity in mAh:"+batteryCapacity);
		System.out.println("screenSize in inches:"+screenSize);
		System.out.println("os:"+os);
		System.out.println("harddiskSize in GB:"+harddiskSize);
		System.out.println("ramSize in GB:"+ramSize);
		
		if(serialNo>0 && serialNo<=10000)
		{
			System.out.println("Valid serialNo");
		}
		else
		{
			System.out.println("In-valid serialNo");
		}
		
		if(price>0.0 && price<50000.0)
		{
			System.out.println("Valid price ");
		}
		else
		{
			System.out.println("In-valid price");
		}
		
		if(batteryCapacity>1000 && batteryCapacity<4000)
		{
			System.out.println("battery Capacity is valid");
		}
		else
		{
			System.out.println("In-valid battery Capacity ");
		}	
        
		
		if(screenSize>8.0 && screenSize<=20.0)
		{
			System.out.println("Valid screenSize");
		}
		else
		{
			System.out.println("In-valid screenSize");
		}		
		
		
		if(harddiskSize>16 && harddiskSize<=1000)
		{
			System.out.println("Valid harddisk Size");
		}
		else
		{
			System.out.println("In-valid harddisk Size");
		}

        if(ramSize>4 && ramSize<=192)
		{
			System.out.println("Valid ram Size");
		}
		else
		{
			System.out.println("In-valid ram Size");
		}				
		
	}
}