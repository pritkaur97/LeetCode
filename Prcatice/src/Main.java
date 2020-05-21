
public class Main {
	
		public static void main(String args[]){
			
		int principal=(int)Console.readNumber("Principal: ",1000, 1000000);
		double interest= Console.readNumber("Annual Interest: ",1,30);
		byte period= (byte)Console.readNumber("Years: ",1,30);
		
		new MortgageReport().printMortgage(principal, interest, period);
	}
	
}
