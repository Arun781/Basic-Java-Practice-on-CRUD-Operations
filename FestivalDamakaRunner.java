class FestivalDamakaRunner
{
	public static void main(String[]festNames)
	{
	System.out.println("Declaring the fest Names");
	FestivalDamaka.save("Dasara");
	FestivalDamaka.save("Deepavali");
	FestivalDamaka.save("Yugadhi");
	FestivalDamaka.save("Hosa Varsha");
	FestivalDamaka.save("Ganesh Habba");
	FestivalDamaka.save("hh"); //length of the index is two err msg
	FestivalDamaka.save("Ganesh Habba");
	FestivalDamaka.save("Ganesh Habba");
	FestivalDamaka.displayDetails();
	boolean note=FestivalDamaka.findname("Yugadhi");
	System.out.println("Name found: "+note);
	System.out.println("main end");
	}
	
}
