//package demo;
//
//import com.sun.deploy.net.HttpResponse;
//import org.testng.annotations.Test;
//import sun.net.www.http.HttpClient;
//
//import java.io.IOException;
//
//public class MyHttpClient {
//
//    @Test
//    public void test1() throws IOException {
//
//        //用来存放我们的结果
//        String result;
//        HttpGet get = new HttpGet("https://www.baidu.com/");
//        //这个是用来执行get方法的
//        HttpClient client = new DefaultHttpClint();
//        HttpResponse response = client.execute(get);
//        result = EntityUtils.toString(response.getEntity(),"utf-8");
//        System.out.println(result);
//    }
//}
