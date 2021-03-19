package suite;

import org.testng.Assert;
import org.testng.annotations.*;

public class demoTest {

    //最基本的注释，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test(dependsOnMethods = "testCase1",alwaysRun = true,description = "test1...")
    public void testCase2(){
        System.out.println("这是测试用例2");
        Assert.assertEquals(false,true);
    }

    @Test(enabled = false)
    public void testCase3(){
        System.out.println("这是测试用例3");
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }

    //类包含多个方法
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行之后运行的方法");
    }

    //套件包含类
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }


}
