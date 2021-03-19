//package cookies;
//
//import com.sun.deploy.net.HttpResponse;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import sun.net.www.http.HttpClient;
//
//import java.net.CookieStore;
//import java.util.HashSet;
//import java.util.Locale;
//import java.util.ResourceBundle;
//
//public class MyCookiesForget {
//
//    private String url;
//    private ResourceBundle bundle;
//    //用来存储cookies信息的变量
//    private CookieStore store;
//
//    @BeforeTest
//    public void beforeTest(){
//        //读取配置文件
//        bundle = ResourceBundle.getBundle("application.properties", Locale.CANADA);
//        //应用配置文件的url
//        url = bundle.getString("dev.url");
//        System.out.println(url);
//    }
//
//    @Test
//    public void testGetCookies(){
//        String result;
//        //声明变量   从配置文件中拼接测试url
//        String url = bundle.getString("login.url");
//        String testUrl = this.url+url;
////
//////        HttpGet get = new HttpGet(this.url+bundle.getString());
//////        测试逻辑代码数据
//        HttpGet get = new HttpGet(testUrl);
//        HttpClient client = new DefaultHttpClient();
//        HttpResponse response = client.execute(get);
//        result = EntityUtils.toString(response.getEntity(),"utf-8");
//        System.out.println(result);
//
//        //获取cookie信息
//        this.store = client.getCookieStore();
//        for (Cookie cookie : cookieList){
//            String name = cookie.getName();
//            String value = cookie.getValue();
//            System.out.println("cookie name = "+name + "cookie value" + value);
//        }
//    }
//}
