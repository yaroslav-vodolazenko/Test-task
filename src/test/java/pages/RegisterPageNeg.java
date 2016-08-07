package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class RegisterPageNeg extends BasePage {

    private String firstName = "Yaroslav";
    private String lastName = "Vodolazhenko";
    private String address = "Entusiastov";
    private String city = "123456789!@#$%^qweasd";
    private String zipcode = "10504;!$%^*(";
    private String stateDefault = "StAte*!@#$%^";
    private String phone = "3805011q we!@$#";
    private String email = "test_qa@ukr.netnet";
    private String businessName = "Yar@!#tyn)(&";
    private String businessNumber = "+3806 6000s@!123as0";
    private String username = "ya!@";
    private String password = "12345";



    public RegisterPageNeg(WebDriver driver) {
        super(driver);
        URL = "http://www.cheapdomains.com.au/register/member_register_test.php";
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    public String firstName() {
        driver.findElement(FIRSTNAME).click();
        driver.findElement(FIRSTNAME).sendKeys(firstName, Keys.ENTER);
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return error;
    }

    public String firstNameAndLastName() {

        driver.findElement(LASTNAME).click();
        driver.findElement(LASTNAME).sendKeys(lastName, Keys.ENTER);
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return error;
    }

    public String fromFirstNameToAddress() {
        driver.findElement(ADDRESS).click();
        driver.findElement(ADDRESS).sendKeys(address, Keys.ENTER);
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return error;
    }

    public String fromFirstNameToCity() {
        driver.findElement(CITY).click();
        driver.findElement(CITY).sendKeys(city, Keys.ENTER);
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return error;
    }

    public String fromFirstNameToZipcode() {
        driver.findElement(ZIPCODE).click();
        driver.findElement(ZIPCODE).sendKeys(zipcode, Keys.ENTER);
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return error;
    }

    public String fromFirstNameToCountry() {
        driver.findElement(COUNTRY).click();
        driver.findElement(SELECTCOUNTRY).click();
        driver.findElement(CONTINUEORDER).click();
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return error;
    }

    public String fromFirstNameToEmptyCountry() {
        driver.findElement(COUNTRY).click();
        driver.findElement(SELECTEMPTYCOUNTRY).click();
        driver.findElement(CONTINUEORDER).click();
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return error;
    }

    public String fromFirstNameToState() {
        driver.findElement(STATEDEFAULT).click();
        driver.findElement(CONTINUEORDER).click();
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return error;
    }

    public String fromFirstNameToPhoneNumber() {
        driver.findElement(PHONE).click();
        driver.findElement(PHONE).clear();
        driver.findElement(PHONE).sendKeys(phone, Keys.ENTER);
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return error;
    }

    public String fromFirstNameToEmail() {
        driver.findElement(EMAIL).click();
        driver.findElement(EMAIL).sendKeys(email, Keys.ENTER);
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return error;
    }

    public String fromFirstNameToUserType() {
        driver.findElement(USERTYPEBUSINESS).click();
        driver.findElement(CONTINUEORDER).click();
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return error;
    }

    public String fromFirstNameToBusinessName() {
        driver.findElement(BUSINESSNAME).click();
        driver.findElement(BUSINESSNAME).sendKeys(businessName, Keys.ENTER);
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return error;
    }

    public String fromFirstNameToBusinessNumber() {
        driver.findElement(BUSINESSNUMBER).click();
        driver.findElement(BUSINESSNUMBER).sendKeys(businessNumber, Keys.ENTER);
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return error;
    }

    public String fromFirstNameToUsername() {
        driver.findElement(USERNAME).click();
        driver.findElement(USERNAME).sendKeys(username, Keys.ENTER);
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return error;
    }

    public String fromUserNameToPassword() {
        driver.findElement(PASSWORD).click();
        driver.findElement(PASSWORD).sendKeys(password, Keys.ENTER);
        String error = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return error;
    }

}
