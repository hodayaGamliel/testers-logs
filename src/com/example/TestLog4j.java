package com.example;
 
import org.apache.log4j.Logger;

public class TestLog4j 
{
		final static Logger log = Logger.getLogger(TestLog4j.class);
		
		public static void main (String[] args)
		{ 
			log4jMethod();
		}
		private static void log4jMethod() 
		{
			try 
			{
				System.out.println("try");
				throw new Exception();
			}
			catch (Exception e)
			{
				e.printStackTrace();
				
				System.out.println("catch");
				log.fatal("this is fatal log - log4j", e);
			}
		}	
}
