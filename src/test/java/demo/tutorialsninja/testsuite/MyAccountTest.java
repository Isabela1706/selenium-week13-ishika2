package demo.tutorialsninja.testsuite;

import demo.tutorialsninja.pages.MyAccountPage;
import demo.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {

    MyAccountPage myAccountPage = new MyAccountPage();


@Test
    public void test(){

    // 1.1 Click on the My Account Link.
    myAccountPage.clickOnMyAccountLink();


    // 1.2 Call the method “selectMyAccountOptions()” method and pass the   parameter “Register”
    myAccountPage.setClickOnRegister();


    //1.3 Verify the text “Register Account”.

    String expectedText = "Register Account";
    String actualText = myAccountPage.verifyTheRegisterText();
    Assert.assertEquals(actualText, expectedText, "Wrong message display");

}

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {

        //2.1 Click on the My Account Link.
        myAccountPage.clickOnMyAccountLink();
        // 2.2 Call the method “selectMyAccountOptions()” method and pass the  parameter “Login”
        myAccountPage.setClickOnLogin();

        //  2.3 Verify the text “Returning Customer

        String expectedTextMessage = "Returning Customer";
        String actualTextMessage = myAccountPage.verifyText();
        Assert.assertEquals(actualTextMessage, expectedTextMessage, "Wrong message display");
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {

        // 3.1 Click on the My Account Link.
        myAccountPage.clickOnMyAccountLink();
        // 3.2 Call the method “selectMyAccountOptions()” method and pass the  parameter “Register”
        myAccountPage.setClickOnRegister();
        // 3.3 Enter the First Name
        myAccountPage.enterName();
        // 3.4 enterLast Name
        myAccountPage.enterLastName();
        // 3.5 Enter the Email
        myAccountPage.enterEmail();

        // 3.6 Enter the Telephone
        myAccountPage.EnterTelephone();

        // 3.7 Enter the Password
        myAccountPage.enterPassword();


        // 3.8 Enter the Password Confirm
        myAccountPage.enterConfirmPassword();

        // 3.9 Select Subscribe Yes radio button
        myAccountPage.SelectRadioButton();

        // 3.10 Click on the Privacy Policy check box
        myAccountPage.clickOnPrivacyPolicy();

        //  3.11 Click on the Continue button
        myAccountPage.clickOnContinueButton();

        // 3.12 Verify the message “Your Account Has Been Created!”

        String expectedMessage = "Your Account Has Been Created!";
       String actualMessage = myAccountPage.verifyTheMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Wrong message display");

        // 3.13 Click on the Continue button
        myAccountPage.clickOnContinueButtons();

        // 3.14 Click on the My Account Link.
        myAccountPage.clickOnMyAccountLink1();


        // 3.15 Call the method “selectMyAccountOptions()” method and pass the    parameter “Logout”
        myAccountPage.clickOnLogOut();

        // 3.16 Verify the text “Account Logout”
        String expectedAccountMessage = "Account Logout";
        String actualAccountMessage = myAccountPage.verifyTextAccountLogout();
        Assert.assertEquals(actualAccountMessage, expectedAccountMessage, "Wrong message display");


        //  3.17 Click on the Continue button
        myAccountPage.clickOnContinueButtonThree();
    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        //4.1 Click on the My Account Link.
        myAccountPage.clickOnMyAccountLink();

        // 4.2 Call the method “selectMyAccountOptions()” method and pass the parameter “Login”
        myAccountPage.setClickOnLogin();
        // 4.3 Enter the Email address
        myAccountPage.enterEmail();

        //  4.4 Enter the Last Name


        // 4.5 Enter the Password
        myAccountPage.enterPassword();


        // 4.6 Click on the Login button
        myAccountPage.clickOnLoginButton4();


        // 4.7 Verify text “My Account”

        String expectedMyAccountMessage = "My Account";
        String actualMyAccountMessage = myAccountPage.verifyTheMessage();
        Assert.assertEquals(actualMyAccountMessage, expectedMyAccountMessage, "Wrong message display");



        // 4.8 Click on the My Account Link.
        myAccountPage.clickOnMyAccountLink();


        // 4.9 Call the method “selectMyAccountOptions()” method and pass the   parameter “Logout”
        myAccountPage.clickOnLogOut();

        // 4.10 Verify the text “Account Logout”

        String expectedText = "Account Logout";
        String actualText = myAccountPage.verifyTheMessage();
        Assert.assertEquals(actualText, expectedText, "Wrong message display");



        // 4.11 Click on the Continue button
        myAccountPage.clickOnContinueButtonThree();
}
}


