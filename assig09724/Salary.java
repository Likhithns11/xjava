class Salary
{
	public static void job(int age,String gender)//access_specifer non_access_specifer return_type method_name (parameters arguments)
	{
		int basic= 15000;
		if(gender=="male")
		{
			if (age>=18&&age<=25)
			{
				System.out.println("Gender: "+gender);
				System.out.println("Age: "+age);
				System.out.println("salary: "+basic);
				basic=basic-3000;
				System.out.println("After EMI: "+basic);

			}
			else if(age>25&&age<=35)
			{
				basic=basic+2000;
				System.out.println("Age: "+age);
				System.out.println("Gender: "+gender);

				System.out.println("salary: "+basic);
				basic=basic-3000;
				System.out.println("After EMI: "+basic);
			}
			else
			{
			System.out.println("salary: ");

			}
		}
		else if (gender=="female")
		{
			if (age>=18&&age<=25)
			{
				System.out.println("Gender: "+gender);
				System.out.println("Age: "+age);
				System.out.println("salary: "+basic);
				basic=basic-3000;
				System.out.println("After Health insurence: "+basic);

			}
			else if(age>25&&age<=35)
			{
				basic=basic+2000;
				System.out.println("Age: "+age);
				System.out.println("Gender: "+gender);

				System.out.println("salary: "+basic);
				 basic=basic-3000;
				System.out.println("After Health insurence: "+basic);
			}
			else
			{
			System.out.println("salary: ");

			}
		}
	}
}