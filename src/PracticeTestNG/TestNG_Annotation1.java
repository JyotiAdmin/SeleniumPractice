package PracticeTestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Annotation1 {
	 @BeforeClass
	   public void beforeClass() {
	      System.out.println("A - in beforeClass");
	      Reporter.log("A - in beforeClass | Successful |" );
	   }

   // test case 1
   @Test(priority = 0)
   public void AtestCase1() {
      System.out.println("A - in test case 1");
      Reporter.log("A - in test case 1 | Successful |" );
   }

   // test case 2
   @Test(priority = 2)
   public void AtestCase2() {
      System.out.println("A - in test case 2");
      Reporter.log("A - in test case 2 | Successful |" );
   }
   
   // test case 3
   @Test(priority = 1)
   public void AtestCase3() {
      System.out.println("A - in test case 3");
      Reporter.log("A - in test case 3 | Successful |" );
   }
   

   @BeforeMethod
   public void beforeMethod() {
      System.out.println("A - in beforeMethod");
      Reporter.log("A - in afterClass | Successful |" );
   }

   @AfterMethod
   public void afterMethod() {
      System.out.println("A - in afterMethod");
   }

   @AfterClass
   public void afterClass() {
      System.out.println("A - in afterClass");
   }

   @BeforeTest
   public void beforeTest() {
      System.out.println("A - in beforeTest");
   }

   @AfterTest
   public void afterTest() {
      System.out.println("A - in afterTest");
   }

  /* @BeforeSuite
   public void beforeSuite() {
      System.out.println("A - in beforeSuite");
   }

   @AfterSuite
   public void afterSuite() {
      System.out.println("A - in afterSuite");
   }*/

}

