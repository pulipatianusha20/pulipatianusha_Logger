package simple_interest_logger1.simpleInterestLogger1;

import java.util.Scanner;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.Test;

public class Logger1 {
	private static Logger logger=LogManager.getLogger(Logger1.class);
	@Test
	public void Simple_Compound_Interest() {
		
		double priniple_amount,rate_of_interest,time;
		double amount=0,rate=1;
		double simp1e_Interest;
		double compound_Interest;
		
		Scanner sc=new Scanner(System.in);
		logger.trace("Enter principle_amount\n");	
		priniple_amount=sc.nextInt();
		
		logger.info("Enter rate_of_interest");
		rate_of_interest=sc.nextInt();
		
		logger.info("Enter time\n");
		time=sc.nextInt();
		
		//simple interest calculation
		logger.debug("simple compound interest using logger\n");
		
		simp1e_Interest=((priniple_amount)*(rate_of_interest)*(time))/100;
		logger.info(" Simple_Interest : %.3f\n",simp1e_Interest );        // simp1e_Interest upto 3 decimals
		
		//compound interest calculation
		
		rate_of_interest=1+(rate_of_interest/100);
		for(int i=1;i<=time;i++) {
			rate*=rate_of_interest;
		}
		amount=priniple_amount*rate;
		compound_Interest=amount-priniple_amount;
		
		logger.info(" compound_Interest : %.3f\n",compound_Interest);     //compound_Interest upto 3 decimals
		
	}
}
