package suite;

//import org.testng.annotations.Test;


import org.testng.annotations.Test;

public class ignoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignorel 执行！");
    }

    //    不执行(忽略测试)
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行！");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行！");
    }
}
