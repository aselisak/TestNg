package class02;

import org.testng.annotations.*;

public class Testing {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("i am before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("i am after suite");
    }


    @BeforeTest
    public void beforeTest(){
        System.out.println("i am before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("i am after test");
    }

     @BeforeClass
     public void beforeClass(){
        System.out.println("I am before class method");
}
     @AfterClass
     public void afterClass(){
    System.out.println("This is my after method");
}
    @BeforeMethod
    public void before(){
        System.out.println("this is my before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("this is my after method");
    }
    @Test
    public void Test(){
        System.out.println("drive me crazy, drive me mad");
    }
    @Test
    public void Test2(){
        System.out.println("drive me sanity");
    }
}
