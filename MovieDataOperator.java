class MovieDataOperator{
	static String[] movie={null,null,null,null,null,null,};
	static int position=0;
	
	static void movieNames(String KGF)
	{
		System.out.println("List of movieNames");
		movie[position]=KGF;
		position++;
		for(int index=0;index<=movie.length;index++)
	   {
		   System.out.println("cool mugithu"+index);
		   System.out.println("Arun  :-"+movie[position]);
		   
	   }
	}
}
