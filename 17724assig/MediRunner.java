class MediRunner
{
	public static void main(String[]tablets)
	{
		if(tablets.length==4)
		{
		String name=tablets[0];
		String manfDate=tablets[1];
		String price=tablets[2];
		String quantity=tablets[3];
		//int convertedmanfDate=Integer.parseInt(manfDate);
		//float convertedprice=Float.parseFloat(price);
		//int convertedquantity=Integer.parseInt(quantity);
		        int convertedManfDate = Integer.parseInt(manfDate);
                float convertedPrice = Float.parseFloat(price);
                int convertedQuantity = Integer.parseInt(quantity);
		//Medi.medicine(name,convertedmanfDate,convertedprice,convertedquantity);
		  Medi.medicine(name, convertedManfDate, convertedPrice, convertedQuantity);
		}
		else
		{
			System.out.println("Enter 4 values");
		}

		
	}
}