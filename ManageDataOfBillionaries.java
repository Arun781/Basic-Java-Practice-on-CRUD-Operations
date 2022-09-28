class ManageDataOfBillionaries{
	static String[] nameOfBillionaries={null,null,null,null,null,null,null,null};
	static int position=0;
	static void billionariesDetails(String billionaries)
	{
		if(billionaries!=null && billionaries.length()>3)
		{
		if(position>=7)	
		{
			System.out.println("----------------------------------------------------------------------");
			System.out.println("The length of the Billionaries");
			return;
		}
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Listing the Billionaries and order vise");
			nameOfBillionaries[position]=billionaries;
			position++;
			System.out.println("The Billionaries name is "+nameOfBillionaries[position]+" at the position "+position);
			System.out.println("Listed out the Billionaries as per order");
		}
		else
		{
			System.out.println("Listing the Billionaries and order vise"+billionaries);
		}
	}
	static void displaybillionaries()
	{
		System.out.println("Display List of Billionaries");
		for(int list=0; list<nameOfBillionaries.length; list++)
		{
			System.out.println("----------------------------------------------------------------------");
			System.out.println("The list Billionaries :-"+nameOfBillionaries[list]);
		}
	}
	static boolean findName(String billionariesNames)
	{
		for(int data=0; data<nameOfBillionaries.length; data++)
		{
			if(nameOfBillionaries[data]==billionariesNames);
			return true;
		}
		return false;
	}
	static String updateBillionaries(String oldName,String newName)
	{
		if(oldName!=null && newName!=null)
		{
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Interchanging the oldName with newName");
			for (int swap=0;swap<nameOfBillionaries.length; swap++)
			{
				if(oldName==nameOfBillionaries[swap])
				{
					String ref=nameOfBillionaries[swap];
					System.out.println("Billionarie found :-"+ref+"at index"+swap+"interchanged"+newName);
					nameOfBillionaries[swap]=newName;
				}
			}
		}
		else
		{
			System.err.println("Name of declared Billionarie is invalid");
		}
		return null;
	}
	static String Update(int swapping, String newName)
	{
		if(newName!=null)
		{
			System.out.println("Entered update using index");
			String exchange=nameOfBillionaries[swapping];
			System.out.println("Billionarie found :"+exchange+"updateed :"+newName+"at index :"+swapping);
			nameOfBillionaries[swapping]=newName;
			return newName;
		}
		else
		{
			System.err.println("Name of declared Billionarie is invalid");
		}
		return null;
	}
	static void delete(String title)
	{
		if(title!=null)
		{
			System.out.println("Entered delete using title");
			for (int vip=0; vip<nameOfBillionaries.length; vip++)
			{
				if(title==nameOfBillionaries[vip])
				{
					String lebel=nameOfBillionaries[vip];
					System.out.println("nameOfBillionaries found"+lebel+"Deleting into null at index"+vip);
					nameOfBillionaries[vip]=null;
				}
				else
				{
					System.out.println("Cannot Delete null");
				}
			}
		}
	}
}

					
					
					
					
					