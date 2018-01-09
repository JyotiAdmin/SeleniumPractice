package PracticeTestNG;

import org.testng.annotations.Test;

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.AfterSuite;

	


public class TestNG_Annotation2 {
	
	 @BeforeClass
	   public void beforeClass() {
	      System.out.println("B - in beforeClass");
	   }
	   // test case 1
	 @Test(priority = 4)
	   public void BtestCase1() {
	      System.out.println("B - in test case 1");
	   }

	   // test case 2
	 @Test(priority = 3)
	   public void BtestCase2() {
	      System.out.println("B - in test case 2");
	   }
	   
	   // test case 3
	 @Test(priority = 5)
	   public void BtestCase3() {
	      System.out.println("B - in test case 3");
	   }

	   @BeforeMethod
	   public void beforeMethod() {
	      System.out.println("B - in beforeMethod");
	   }

	   @AfterMethod
	   public void afterMethod() {
	      System.out.println("B - in afterMethod");
	   }  

	   @AfterClass
	   public void afterClass() {
	      System.out.println("B - in afterClass");
	   }

	   @BeforeTest
	   public void beforeTest() {
	      System.out.println("B - in beforeTest");
	   }

	   @AfterTest
	   public void afterTest() {
	      System.out.println("B - in afterTest");
	   }

	  /* @BeforeSuite
	   public void beforeSuite() {
	      System.out.println("B - in beforeSuite");
	   }

	   @AfterSuite
	   public void afterSuite() {
	      System.out.println("B - in afterSuite");
	   }*/

}


