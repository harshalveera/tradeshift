package com.harshal.tradeshift.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestSuite.class);

      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      int failureCount = result.getFailureCount();
      System.out.println("Test Results");
      System.out.println(result.getRunCount()+" tests run in "+result.getRunTime());
      if(failureCount == 0){
    	  System.out.println("Test Results were Successful");
      } else {
          System.out.println(failureCount+" tests failed");    	  
      }
   }
}