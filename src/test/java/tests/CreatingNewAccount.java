package tests;

import addons.LogForTest;
import org.testng.annotations.Test;
import pages.RegisterPagePos;

public class CreatingNewAccount extends BaseTest {


    @Test //positive test
    public void Test1Account() throws InterruptedException {
        RegisterPagePos accountPage = new RegisterPagePos(driver);
        //positive test
        accountPage.firstName();
        accountPage.lastName();
        accountPage.address();
        accountPage.city();
        accountPage.zipcode();
        accountPage.countryU();
        accountPage.state();
        accountPage.phone();
        accountPage.email();
        accountPage.username();
        accountPage.password();
        String error = accountPage.button();
        LogForTest.info("Fill all fields and have next alert: \n" + error);
    } //Bug#1 - FirstName input disappears on password input.
      //Bug#2 - Business Name and Business Number are hidden

    @Test //positive test
    public void Test2BusinessAccount() throws InterruptedException {

        RegisterPagePos accountPage = new RegisterPagePos(driver);
        accountPage.firstName();
        accountPage.lastName();
        accountPage.address();
        accountPage.city();
        accountPage.zipcode();
        accountPage.country();
        accountPage.stateWithSelect();
        accountPage.phone();
        accountPage.email();
        accountPage.userTypeBusiness();
        accountPage.businessName();
        accountPage.businessNumberOperator();
        accountPage.businessNumber();
        accountPage.username();
        accountPage.password();

            String error = accountPage.button();
            LogForTest.info("Fill all fields, chose business and have next alert: \n" + error);

            accountPage.firstName();//do while Bug#1 exist


        String error2 = accountPage.button();
        LogForTest.info("After First Name filed \n" + error2);

    }

    @Test    //positive test
    public void Test3PersonalAccount() throws InterruptedException {

        RegisterPagePos accountPage = new RegisterPagePos(driver);
        accountPage.firstName();
        accountPage.lastName();
        accountPage.address();
        accountPage.city();
        accountPage.zipcode();
        accountPage.countryU();
        accountPage.state();
        accountPage.phone();
        accountPage.email();
        accountPage.userTypePersonaL();
        accountPage.username();
        accountPage.password();
        String error = accountPage.button();
        LogForTest.info("Fill all fields and have next alert: \n" + error);
    }

}


