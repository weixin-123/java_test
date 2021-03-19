package suite;

import org.testng.annotations.Test;

//异常测试
public class expectedException {

    /**
     * 什么时候会用到异常测试？？
     * 预期结果与实际结果不一致
     */

//    这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

//    这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}
