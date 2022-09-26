class GraduateDataOperator{
	static String[] graduateName={null,null,null,null,null,null};
	static int position=0;
	static void graduateName(String introvert)
	{
		System.out.println("Start aytu appa jeevanaa");
		graduateName[position]=introvert;
		position++;
		for(int index=0;index<=graduateName.length;index++)
	   {
		   System.out.println("engineering mugithu"+index);
		   System.out.println("Branches of Bachelor of Engg graduate :-"+graduateName[position]);
		   
	   }
		
	}
}

