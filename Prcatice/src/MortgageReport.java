import java.text.NumberFormat;

public class MortgageReport {
	public void printMortgage(int principal,double interest, int period){
		double result=MortgageCalculator.calculator(principal, interest, period);
		
		NumberFormat currency= NumberFormat.getCurrencyInstance();
		String  mortgageFormatted= currency.format(result);
		System.out.println();
		System.out.println("MORTGAGE");
		System.out.println("--------");
		System.out.println("Monthly payments: " + mortgageFormatted);
		 
	}
}
