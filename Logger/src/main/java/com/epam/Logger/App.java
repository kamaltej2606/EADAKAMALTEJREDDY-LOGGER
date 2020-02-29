package com.epam.Logger;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOGGER =LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        LOGGER.info("Enter the option:\n1:Calculate Interest\n2:Estimate House Cost");
        int op=sc.nextInt();
        if(op==1) {
        	LOGGER.info("Enter Prinicipe Amount");
        	double p=sc.nextDouble();
        	LOGGER.info("Enter Total Tenure");
        	double t=sc.nextDouble();
        	LOGGER.info("Enter Rate Of Interest");
        	double r=sc.nextDouble();
        	LOGGER.info("Enter an option :\n1:Simple Interest\n2:Compound Interest");
        	int opt=sc.nextInt();
        	if(opt==1) {
        		Simple obj1=new Simple(p,t,r);
        		LOGGER.info("Simple Interest is :"+obj1.simp()+"INR");
        	}
        	else if(opt==2) {
        		Compound obj2=new Compound(p,t,r);
        		LOGGER.info("Compound Interest is :"+obj2.comp()+"INR");
        	}
        }
        else if(op==2) {
        	LOGGER.info("Enter the area of the house");
        	double area=sc.nextDouble();
        	LOGGER.info("Enter Material Standards you need :");
        	LOGGER.info("1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High Standard Material And Fully Automated House");
        	int opn=sc.nextInt();
        	House obj3=new House(area,opn);
        	LOGGER.info("Total Cost for constructing the house is :"+obj3.hou()+"INR");
        }
        else {
        	LOGGER.info("Invalid Option");
        }
    }
}