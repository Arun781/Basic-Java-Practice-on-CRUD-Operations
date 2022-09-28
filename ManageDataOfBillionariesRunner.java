class ManageDataOfBillionariesRunner{
	public static void main(String [] billinoriesNames)
	{
		
		ManageDataOfBillionaries.billionariesDetails("Elon Musk");
		ManageDataOfBillionaries.billionariesDetails("Bernard Arnault & family");
		ManageDataOfBillionaries.billionariesDetails("Jeff Bezos");
		ManageDataOfBillionaries.billionariesDetails("John Malone");
		ManageDataOfBillionaries.billionariesDetails("Pongsak Viddayakorn");
		ManageDataOfBillionaries.billionariesDetails("Bill Gates");
		ManageDataOfBillionaries.billionariesDetails("Warren Buffett");
		//ManageDataOfBillionaries.billionariesDetails("Larry Page"); //excceded element
		//ManageDataOfBillionaries.billionariesDetails("Bi");        //length is not matching
		ManageDataOfBillionaries.displaybillionaries();
		
		boolean data=ManageDataOfBillionaries.findName("Bill Gates");
		System.out.println("Billionarie Name found :"+data);
		
		ManageDataOfBillionaries.updateBillionaries("Elon Mask","Introvert World");
		ManageDataOfBillionaries.displaybillionaries();
		ManageDataOfBillionaries.Update(4,"Introvert");
		ManageDataOfBillionaries.displaybillionaries();
		
		ManageDataOfBillionaries.delete("Warren Buffett");
		ManageDataOfBillionaries.displaybillionaries();
		//ManageDataOfBillionaries.delete(6);
		ManageDataOfBillionaries.displaybillionaries();
	
		System.out.println("main end");
		
	}
}