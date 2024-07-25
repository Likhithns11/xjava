class Tomb
{
	public static String country(int code)
	{
		System.out.println("Entered code: "+code);
		if(code==91)
		{
			return "INDIA";
		}
		else if(code==1)
		{
			return "AMERICA";
		}
		else if(code==4)
		{
			return "UAE";
		}
		else if(code==2)
		{
			return "AFGANISTHAN";
		}
		else if(code==7)
		{
			return "RUSSIA";
		}
		return "ERROR";
	}
	
	public static double thing(String item)
	{
		System.out.println("Entered item: "+item);
		if(item=="Glass")
		{
			return 350.765;
		}
		else if(item=="watch")
		{
			return 2499.999;
		}
		else if(item=="belt")
		{
			return 499.899;
		}
		else if(item=="bag")
		{
			return 2599.678;
		}
		else if(item=="table")
		{
			return 4999.878;
		}
		return 0;
	}
	public static String movie(String name)
	{
		System.out.println("Entered Movie Name: "+name);
		if(name=="KGF")
		{
			return "Vijay Kiragandur";
		}
		else if(name=="Bahubali")
		{
			return "Shobu Yarlagadda";
		}
		else if(name=="RRR")
		{
			return "D. V. V. Danayya";
		}
		else if(name=="Pathaan")
		{
			return "Aditya Chopra";
		}
		else if(name=="salaar")
		{
			return "Vijay Kiragandur";
		}
		return "ERROR";
	}
	public static double medicine(String medname)
	{
		System.out.println("Enter medicine Name: "+medname);
		if(medname=="Acebrophylline")
		{
			return 845.839;
		}
		else if(medname=="Aceclofenac")
		{
			return 723.345;
		}
		else if(medname=="Paracetamol")
		{
			return 935.786;
		}
		
		return 0;
	}
	public static String medicineName(String symptom)
	{
		System.out.println("Enter The Symptom: "+symptom);
		if(symptom=="fever")
		{
			return "Paracetamol";
		}
		else if(symptom=="cough")
		{
			return "Dextromethorphan";
		}
		else if(symptom=="covid")
		{
			return "Paxlovid";
		}
		
		return "ERROR";
	}
	
	public static double docName(String doctorName)
	{
		System.out.println("Enter Doctor Name: "+doctorName);
		if(doctorName=="ravi")
		{
			return 9.30;
		}
		else if(doctorName=="ajay")
		{
			return 13.20;
		}
		else if(doctorName=="vinay")
		{
			return 18.30;
		}
		
		return 0;
	}
}