package House_Logger.House_Construction_Logger;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class ConstructionCost_Logger {
	private static final Logger logger = LogManager.getLogger(ConstructionCost_Logger.class);
	@Test
	public void construction_Logger() {
		double area_of_house;
		Scanner sc=new Scanner(System.in);
		
		logger.info("Enter area_of_house(in square feet)\n");
		area_of_house=sc.nextDouble();
		
		logger.info("Select cost of standard material for house per square feet construction\n");
		logger.info("1 : 1200INR for standard materials\n");
		logger.info("2 : 1500INR for above standard materials\n");
		logger.info("3 : 1800INR for high standard material\n");
		logger.info("4 : 2500INR for high standard material and fully automated home\n");
	    int choice=sc.nextInt();
	    if (choice>=1 && choice<5) {
	    	double[] house_construction_cost ={
	    		area_of_house*1200,
	    		area_of_house*1500,
	    		area_of_house*1800,
	    		area_of_house*2500
	       };
		   logger.info("House_Construction_Cost : %.2fINR\n ",house_construction_cost[choice-1]);   //House_Construction_Cost upto 2 decimal point
	    }
	    else {
	    	 logger.error("Invalid Choice\n"); 	
	}
  }
}
