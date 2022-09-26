class FoodItemsDataOperator
{
	static String[]foodItems={null,null,null,null,null,null};
	static int position=0;
	static void foodItems(String cocolava)
	{
		System.out.println("The taste of the cocolvaa is ");
		foodItems[position]=cocolava;
		position++;
	
	      for(int index=0;index<=foodItems.length;index++)
	  {
		   System.out.println(" ayyyoo mugithu"+index);
		   System.out.println("The taste is good  :-"+foodItems[position]);
		   
	   }
	}
}
