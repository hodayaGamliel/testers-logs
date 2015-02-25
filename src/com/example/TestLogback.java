package com.example;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class TestLogback {

//		static final Logger LOG = LoggerFactory.getLogger(logback_test.class);
		
		public static void main(String[] args)
		{
			logback();
		}
		
		public static void logback()
		{
			try 
			{
				throw new Exception() ;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
//				LOG.trace("Hello World!", e);
//				LOG.debug("How are you today?", e);
//				LOG.info("I am fine.", e);
//				LOG.warn("I love programming.", e);
//				LOG.error("I am programming.", e);
			}
			
		}

}
