package tests;

import addons.LogForTest;
import org.testng.annotations.Test;
import pages.RegisterPageNeg;


public class NegativeTests extends BaseTest {

    @Test
    public void NegTest1() throws InterruptedException {


        RegisterPageNeg negative = new RegisterPageNeg(driver);

        String error = negative.firstName();
        LogForTest.info("Enter just name, and have next alert: \n" + error);

        String error1 = negative.firstNameAndLastName();
        LogForTest.info("Enter First name and Last name \n" + error1);

        String error2 = negative.fromFirstNameToAddress();
        LogForTest.info("Enter First name, Last name and Address \n" + error2);

        String error3 = negative.fromFirstNameToCity();
        LogForTest.info("Enter First name, Last name, Address and Invalid City \n " + error3 +
                "\n");

        String error4 = negative.fromFirstNameToZipcode();
        LogForTest.info("Enter First name, Last name, Address, City and ZipCode with Invalid symbols \n"
                + error4);

        String error5 = negative.fromFirstNameToEmptyCountry();
        LogForTest.info("Enter First name, Last name, Address, City, ZipCode and Country \n" + error5);

        String error6 = negative.fromFirstNameToCountry();
        LogForTest.info("Enter First name, Last name, Address, City, ZipCode and Country \n" + error6);

        String error7 = negative.fromFirstNameToState();
        LogForTest.info("Enter First name, Last name, Address, City, ZipCode, Country " +
                "and State \n" +
                error7 + "\n");

        String error8 = negative.fromFirstNameToPhoneNumber();
        LogForTest.info("Enter First name, Last name, Address, City, ZipCode, Country " +
                "and Number \n" + error8);

        String error9 = negative.fromFirstNameToEmail();
        LogForTest.info("Enter First name, Last name, Address, City, ZipCode, Country, " +
                "State, Number and Email \n" + error9);

        String error10 = negative.fromFirstNameToUserType();
        LogForTest.info("Enter First name, Last name, Address, City, ZipCode, Country, " +
                "State, Number, Email and UserType \n" + error10);

        String error11 = negative.fromFirstNameToBusinessName();
        LogForTest.info("Enter First name, Last name, Address, City, ZipCode, Country, " +
                "State, Number, Email, UserType and Business name \n" +
                error11);

        String error12 = negative.fromFirstNameToBusinessNumber();
        LogForTest.info("Enter First name, Last name, Address, City, ZipCode, Country, " +
                "State, Number, Email, UserType," + " Business name and Business number \n" +
                error12);

        String error13 = negative.fromFirstNameToUsername();
        LogForTest.info("Enter First name, Last name, Address, City, ZipCode, Country, " +
                "State, Number, Email, UserType, Business name, " + "Business number, username \n" +
                error13);

        String error14 = negative.fromUserNameToPassword();
        LogForTest.info("Enter First name, Last name, Address, City, ZipCode, Country, " +
                "State, Number, Email, UserType, Business name," + " Business number, username, pass. And have One " +
                "error with FirstName \n" + error14);
    }
}