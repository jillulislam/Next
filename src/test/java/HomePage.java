import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jillu\\IdeaProjects\\next\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.next.co.uk/");
        Thread.sleep(1000);
        Actions act = new Actions(driver);
        WebElement textBox = driver.findElement(By.name("w"));
        act.moveToElement(textBox).keyDown(Keys.LEFT_SHIFT).sendKeys("jhgjhgg").build().perform();
 //       driver.findElement(By.name("w")).sendKeys("sasasd");
//        WebElement menu = driver.findElement(By.xpath("//nav[@id='MainNavigation']/div/ul/li[4]"));
//        act.moveToElement(menu).build().perform();
//        Thread.sleep(3000);
//        WebElement sweatshirts = driver.findElement(By.xpath("//*[@id='navigationitem17-cjky4nupecib1dtjv9vie3ba4']"));
//        act.moveToElement(sweatshirts).click().build().perform();

//        @Test
//        public void windowHandling(){
//            Set<String> winid = driver.getWindowHandles();
//            Iterator<String> its = winid.iterator();
//            String firstWindow = its.next();
//            String secondWindow = its.next();
//            driver.switchTo().window(firstWindow);
//            driver.get("https://outlook.live.com/owa/");
//            System.out.println(driver.getTitle());
//        driver.findElement(By.xpath("//div/aside/div/nav/ul/li[1]/a")).click();
//        driver.switchTo().window(secondWindow);
//        System.out.println(driver.getTitle());

    }
}
