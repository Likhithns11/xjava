class TombRunner
{
	public static void main(String[] args)
	{
		String code=Tomb.country(7);
		System.out.println("country: "+code);
		String code1=Tomb.country(91);
		System.out.println("country: "+code1);
		String code2=Tomb.country(1);
		System.out.println("country: "+code2);
		String code3=Tomb.country(4);
		System.out.println("country: "+code3);
		String code4=Tomb.country(2);
		System.out.println("country: "+code4);
		String code5=Tomb.country(0);
		System.out.println("country: "+code5);
		System.out.println("======================");
		double cost=Tomb.thing("table");
		System.out.println("Price: "+cost);
		double cost1=Tomb.thing("glass");
		System.out.println("Price: "+cost1);
		double cost2=Tomb.thing("watch");
		System.out.println("Price: "+cost2);
		double cost3=Tomb.thing("belt");
		System.out.println("Price: "+cost3);
		double cost4=Tomb.thing("bag");
		System.out.println("Price: "+cost4);
		double cost5=Tomb.thing("tool");
		System.out.println("Price: "+cost5);
				System.out.println("======================");

		String producer=Tomb.movie("RRR");
		System.out.println("Producer: "+producer);
		String producer1=Tomb.movie("KGF");
		System.out.println("Producer: "+producer1);
		String producer2=Tomb.movie("Bahubali");
		System.out.println("Producer: "+producer2);
		String producer3=Tomb.movie("Phataan");
		System.out.println("Producer: "+producer3);
		String producer4=Tomb.movie("salaar");
		System.out.println("Producer: "+producer4);
		String producer5=Tomb.movie("black");
		System.out.println("Producer: "+producer5);
				System.out.println("======================");

		double amount=Tomb.medicine("Paracetamol");
		System.out.println("Amount: "+amount);
		double amount1=Tomb.medicine("Aceclofenac");
		System.out.println("Amount: "+amount1);
		double amount2=Tomb.medicine("Acebrophylline");
		System.out.println("Amount: "+amount2);
		double amount3=Tomb.medicine("Paracetamytol");
		System.out.println("Amount: "+amount3);
				System.out.println("======================");

		String medicineName=Tomb.medicineName("covid");
		System.out.println("Medicine: "+medicineName);
		String medicineName1=Tomb.medicineName("fever");
		System.out.println("Medicine: "+medicineName1);
		String medicineName2=Tomb.medicineName("cough");
		System.out.println("Medicine: "+medicineName2);
		String medicineName3=Tomb.medicineName("headace");
		System.out.println("Medicine: "+medicineName3);
				System.out.println("======================");

		double doctorTime=Tomb.docName("ajay");
		System.out.println("Available From: "+doctorTime);
		double doctorTime1=Tomb.docName("ravi");
		System.out.println("Available From: "+doctorTime1);
		double doctorTime2=Tomb.docName("vinay");
		System.out.println("Available From: "+doctorTime2);
		double doctorTime3=Tomb.docName("hari");
		System.out.println("Available From: "+doctorTime3);
	}
	
}