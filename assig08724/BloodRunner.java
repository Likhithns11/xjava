class BloodRunner
{
	public static void main(String[] args)
	{
		char group = Blood.group1();
		System.out.println("Blood Group: "+group);
		
		String name=Blood.personName();
		System.out.println("Donar Name: "+name);
		
		double cost=Blood.cost();
		System.out.println("Total Amount: "+cost);
		
		String HospitalName=Blood.hospitalName();
		System.out.println("hospital Name : "+HospitalName);
		
		String donation=Blood.testsick();
		System.out.println("Any Sickness : "+donation);
		
		String elegability =Blood.donation(450);
		System.out.println("Elegable : "+elegability);


	}

}