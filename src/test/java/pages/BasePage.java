package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected String URL = "http://www.cheapdomains.com.au/register/member_register_test.php";
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    protected static final By FIRSTNAME = By.xpath("//*[@id='first_name']/td[2]/input");
    protected static final By LASTNAME = By.xpath("//*[@id='last_name']/td[2]/input");
    protected static final By ADDRESS = By.xpath("//*[@id='address']/td[2]/input");
    protected static final By CITY = By.xpath("//*[@id='city']/td[2]/table/tbody/tr/td[1]/input");
    protected static final By ZIPCODE = By.xpath("//*[@id='city']/td[2]/table/tbody/tr/td[5]/input");
    protected static final By COUNTRY = By.xpath("//*[@id='country_name']");
    protected static final By SELECTCOUNTRYU = By.xpath("//*[@id=\"country_name\"]/option[232]");
    protected static final By SELECTCOUNTRY = By.xpath("//*[@id=\"country_name\"]/option[3]");
    protected static final By SELECTEMPTYCOUNTRY = By.xpath("//*[@id=\"country_name\"]/option[2]");
    protected static final By STATEDEFAULT = By.xpath("//*[@id='state_field']");
    protected static final By STATEWITHSELECT = By.xpath("//*[@id='state_field']");
    protected static final By SELECTSTATE = By.xpath("//*[@id='state_field']/option[2]");
    protected static final By PHONE = By.xpath("//*[@id='phone_number']");
    protected static final By EMAIL = By.xpath("//*[@id='email']/td[2]/input");
    protected static final By USERTYPERSONAL = By.xpath("//*[@id='account_type_personal']");
    protected static final By USERTYPEBUSINESS = By.xpath("//*[@id='account_type_business']");
    protected static final By BUSINESSNAME = By.xpath("//*[@id='business']");
    protected static final By BUSINESSNUMBER = By.xpath("//*[@id='business_number_element']");
    protected static final By BUSINESSNUMBEROPERATOR = By.xpath("//*[@id='business_type_element']");
    protected static final By BUSINESSNUMBEROPERATORSELECT = By.xpath("//*[@id='business_type_element']/option[12]");
    protected static final By USERNAME = By.xpath("//*[@id='username']/td[2]/input");
    protected static final By PASSWORD = By.xpath("//*[@id='password']/td[2]/input");
    protected static final By CONTINUEORDER = By.xpath("//*[@id='content_pad']/form[2]/table[3]/tbody/tr/td[2]/input");


}
