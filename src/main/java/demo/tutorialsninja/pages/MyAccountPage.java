package demo.tutorialsninja.pages;

import demo.tutorialsninja.utilities.Utilities;
import org.openqa.selenium.By;

public class MyAccountPage extends Utilities {

    By clickOnMyAccountLink = By.xpath("//span[normalize-space()='My Account']");
    By clickOnRegister=By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']");
    By verifyTheRegisterAccount = By.xpath("//h1[normalize-space()='Register Account']");
    By clickOnLogin=By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']");
    By verifyTheText=By.xpath("//h2[normalize-space()='Returning Customer']");
    By enterTheFirstName=By.xpath("//input[@id='input-firstname']");
    By enterTheLastName=By.xpath("//input[@id='input-lastname']");
    By enterTheEmail=By.xpath("//input[@id='input-email']");
    By enterTelephone=By.xpath("//input[@id='input-telephone']");
    By enterPassword=By.xpath("//input[@id='input-password']");
    By enterConformPassword=By.xpath("//input[@id='input-confirm']");
    By selectRadioButton=By.cssSelector("input[value='1'][name='newsletter']");
    By clickOnPrivacyPolicy=By.xpath("//input[@name='agree']");
    By clickOnContinueButton=By.xpath("//input[@value='Continue']");
    By verifyTheMessage=By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
    By clickOnContinueButtons=By.linkText("Continue");
    By clickOnMyAccountLink1=By.xpath("//span[normalize-space()='My Account']");
    By clickOnLogOut= By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']");
    By verifyTextAccountLogout=By.xpath("//h1[normalize-space()='Account Logout']");
    By clickOnContinueButtonThree=By.linkText("Continue");
    By verifyTextMyAccount=By.xpath("//h2[normalize-space()='My Account']");
    By clickOnLoginButton4=By.xpath("//input[@value='Login']");



    public void clickOnMyAccountLink() {
        clickOnElement(clickOnMyAccountLink);
    }
    public void setClickOnRegister() {
        clickOnElement(clickOnRegister);
    }
    public String verifyTheRegisterText(){
        return getTextFromElement(verifyTheRegisterAccount);

    }
    public void setClickOnLogin(){
        clickOnElement(clickOnLogin);
    }
    public String verifyText(){
        return getTextFromElement(verifyTheText);
    }

    public void enterName(){
        sendTextToElement(enterTheFirstName,"Ella");
    }
    public void enterLastName(){
        sendTextToElement(enterTheLastName,"Patel");
    }
    public void enterEmail(){
        sendTextToElement(enterTheEmail,"Ella12@gmail.com");
    }
    public void EnterTelephone(){
        sendTextToElement(enterTelephone,"900389739478");
    }
    public void enterPassword(){
        sendTextToElement(enterPassword,"ella23414");
    }
    public void enterConfirmPassword(){
        sendTextToElement(enterConformPassword,"ella23414");
    }
    public void SelectRadioButton(){
        clickOnElement(selectRadioButton);

    }
    public void clickOnPrivacyPolicy(){
        clickOnElement(clickOnPrivacyPolicy);
    }
    public void clickOnContinueButton(){
        clickOnElement(clickOnContinueButton);
    }
    public String verifyTheMessage(){
        return getTextFromElement(verifyTheMessage);
    }
    public void clickOnContinueButtons(){
        clickOnElement(clickOnContinueButtons);
    }
    public void clickOnMyAccountLink1(){
        clickOnElement(clickOnMyAccountLink1);
    }
    public void clickOnLogOut(){
        clickOnElement(clickOnLogOut);
    }
    public String verifyTextAccountLogout(){
        return getTextFromElement(verifyTextAccountLogout);
    }
    public void clickOnContinueButtonThree(){
        clickOnElement(clickOnContinueButtonThree);
    }
    public void clickOnLoginButton4(){
        clickOnElement(clickOnLoginButton4);
    }
    public String verifyTextMyAccount(){
        return getTextFromElement(verifyTextMyAccount);

}
}
