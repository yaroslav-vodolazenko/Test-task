package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class RegisterPagePos extends BasePage{



    private String firstName = "Yaroslav";
    private String lastName = "Vodolazhenko";
    private String address = "Entuziastov";
    private String city = "Kiev";
    private String zipcode = "03000";
    private String state = "Kiev";
    private String phone = "+380501234567";
    private String email = "yaroslav.vodolazhenko@gmail.com";
    private String businessName = "Yaroslav";
    private String businessNumber = "+380507654321";
    private String username = "starkiller";
    private String password = "123456";




    public RegisterPagePos(WebDriver driver) {
        super(driver);
        URL = "http://www.cheapdomains.com.au/register/member_register_test.php";
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void firstName() {
        driver.findElement(FIRSTNAME).click();
        driver.findElement(FIRSTNAME).clear();
        driver.findElement(FIRSTNAME).sendKeys(firstName);
    }

    public void lastName() {
        driver.findElement(LASTNAME).click();
        driver.findElement(LASTNAME).clear();
        driver.findElement(LASTNAME).sendKeys(lastName);
    }

    public void address() {
        driver.findElement(ADDRESS).click();
        driver.findElement(ADDRESS).clear();
        driver.findElement(ADDRESS).sendKeys(address);
    }

    public void city() {
        driver.findElement(CITY).click();
        driver.findElement(CITY).clear();
        driver.findElement(CITY).sendKeys(city);
    }

    public void zipcode() {
        driver.findElement(ZIPCODE).click();
        driver.findElement(ZIPCODE).clear();
        driver.findElement(ZIPCODE).sendKeys(zipcode);
    }

    public void country() {
        driver.findElement(COUNTRY).click();
        driver.findElement(SELECTCOUNTRY).click();

    }public void countryU() {
        driver.findElement(COUNTRY).click();
        driver.findElement(SELECTCOUNTRYU).click();

    }

    public void stateWithSelect() {
        driver.findElement(STATEWITHSELECT).click();
        driver.findElement(SELECTSTATE).click();
    }

    public void state() {
        driver.findElement(STATEDEFAULT).click();
        driver.findElement(STATEDEFAULT).clear();
        driver.findElement(STATEDEFAULT).sendKeys(state);
    }

    public void phone() {
        driver.findElement(PHONE).click();
        driver.findElement(PHONE).clear();
        driver.findElement(PHONE).sendKeys(phone);
    }

    public void email() {
        driver.findElement(EMAIL).click();
        driver.findElement(EMAIL).clear();
        driver.findElement(EMAIL).sendKeys(email);
    }

    public void userTypeBusiness() {
        driver.findElement(USERTYPEBUSINESS).click();
    }

    public void userTypePersonaL() {
        driver.findElement(USERTYPERSONAL).click();
    }

    public void businessName() {
        driver.findElement(BUSINESSNAME).click();
        driver.findElement(BUSINESSNAME).clear();
        driver.findElement(BUSINESSNAME).sendKeys(businessName);
    }

    public void businessNumberOperator() {
        driver.findElement(BUSINESSNUMBEROPERATOR).click();
        driver.findElement(BUSINESSNUMBEROPERATORSELECT).click();
    }

    public void businessNumber() {
        driver.findElement(BUSINESSNUMBER).click();
        driver.findElement(BUSINESSNUMBER).clear();
        driver.findElement(BUSINESSNUMBER).sendKeys(businessNumber);
    }

    public void username() {
        driver.findElement(USERNAME).click();
        driver.findElement(USERNAME).clear();
        driver.findElement(USERNAME).sendKeys(username);
    }

    public void password() {
        driver.findElement(PASSWORD).click();
        driver.findElement(PASSWORD).clear();
        driver.findElement(PASSWORD).sendKeys(password);
    }

    public String button() throws InterruptedException {
        driver.findElement(CONTINUEORDER).click();
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        //Thread.sleep(5000);
        return error;
         //stop on next page
    }

    public String successfulRegistration(){
        String site = driver.getCurrentUrl();
        return site;
    }
}


