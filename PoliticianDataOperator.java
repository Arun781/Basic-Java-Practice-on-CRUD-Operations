class PoliticianDataOperator{
	 static String[] dataOperator={null,null,null,null,null,null};
	 static int position=0;
	 static void politicianName(String thief)
	 {
		 System.out.println("CM & PM thief");
		 dataOperator[position]=thief;
		 position++;
		for(int index=0;index<=dataOperator.length;index++)
	   {
		   System.out.println("election mugithu"+index);
		   System.out.println("CM and PM  :-"+dataOperator[position]);
		   
	   }
	}
	 
}
