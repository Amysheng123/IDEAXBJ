import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by amy sheng on 3/27/2018.
 */
public class WebDriver2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.baidu.com");
    }
    public void version(){
        //感谢关注云层天咨微信公众号及腾讯课堂
        System.out.println("感谢关注云层天咨微信公众号及腾讯课堂");

    }
}
