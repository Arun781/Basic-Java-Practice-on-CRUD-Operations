class FestivalDamaka
{
	static String [] festivalNames={null,null,null,null,null,null,null};
	static int position=0;
	
	static void save(String details)
	{

		if(details!=null && details.length()>3)
		{
			if(position>=6)
			{
			System.out.println("THE LENGTH OF THE FEASTIVAL WORDS ARE ABOVE THE NUM 6");
			System.out.println("______________________________________________________");
			return;
	    	}
			System.out.println("___________________________________________________________");
			System.out.println("Entered the Temple");
			festivalNames[position]=details;
			System.out.println("Festival Names is"+festivalNames[position]+"at the position: "+position);
			position++;
			System.out.println("Seen the Temple and exited");
			System.out.println("______________________________________________________");
		}
		else
		{
			System.out.println("______________________________________________________");
			System.err.println("Data not valid "+details);
			System.out.println("______________________________________________________");
		}
		
	}
	static void   displayDetails()
	{
		System.out.println("Displaying details");
		for(int index=0;index<festivalNames.length;index++)
		{
			System.out.println("Colors Names name is : "+festivalNames[index]);
		}
	}
	static boolean findname(String diffName)
	{
		
		for(int index=0;index<festivalNames.length;index++)
		{
			if(festivalNames[index]==diffName)
			return true;
		}
		return false;
	}
}