class ChainRunner
{
	public static void main(String[] args)
	{
		String carat = Chain.carat();
		System.out.println("Carat: "+carat);
		
		double cost=Chain.costper();
		System.out.println("Cost/Gram: "+cost);
		
		String type=Chain.type();
		System.out.println("Gold Type: "+type);
		
		String quality=Chain.quality();
		System.out.println("Quality: "+quality);
		
		String quantity=Chain.quantity();
		System.out.println("Quantity: "+quantity);
		
		String wastage=Chain.wastage();
		System.out.println("Wastage: "+wastage);
		
		double serviceCharger=Chain.serviceCharger();
		System.out.println("Service Charge: "+serviceCharger);
		
		double gst=Chain.gst();
	    System.out.println("Total GST: "+gst);




		


	}

}