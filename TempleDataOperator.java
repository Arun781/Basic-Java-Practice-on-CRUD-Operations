class TempleDataOperator{
	
	static String[] temple={null,null,null,null,null};
	static int position=0;
	
	
	static void templeData(String poojaArchaney)
	{
		System.out.println("poojaArchaney naditha edha");
		temple[position]=poojaArchaney;		
		position++;
		
       for(int index=0;index<=temple.length;index++)
	   {
		   System.out.println("poojaArchaney mugithu"+index);
		   System.out.println("Hanuman :-"+temple[position]);
		   
	   }
	}
}