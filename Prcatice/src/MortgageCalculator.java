
public class MortgageCalculator {
	
	public final static byte NUMBER_OF_MONTHS=12;
	public final static byte PERCENT=100;
	
	public static double calculator(int principal, double interest, int period){
		int monthlyPeriod= period*NUMBER_OF_MONTHS;
		double monthlyInterest= (interest/PERCENT)/NUMBER_OF_MONTHS;	
		
		Double r= Math.pow((1+monthlyInterest), monthlyPeriod);
		
		Double result=principal*((monthlyInterest*r)/(r-1));
		return result;
		
	}
}
