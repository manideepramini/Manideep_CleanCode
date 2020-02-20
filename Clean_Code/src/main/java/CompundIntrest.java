
public class CompundIntrest {
	
	public static double compund_intrest(double principalamount,double rate,double time)
	{
		double ci=principalamount*(Math.pow((1+rate/100),time))-principalamount;
		return ci;
	}


}
