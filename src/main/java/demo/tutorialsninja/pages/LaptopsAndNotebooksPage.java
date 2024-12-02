package demo.tutorialsninja.pages;

import demo.tutorialsninja.utilities.Utilities;
import org.openqa.selenium.By;

public class LaptopsAndNotebooksPage extends Utilities {



    By mouseHoverOnLapTopAndClick = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By showAllLaptopsAndNoteBooks = By.linkText("Show AllLaptops & Notebooks");
    By verifyTextLaptopsAndBooks = By.xpath("//h2[normalize-space()='Laptops & Notebooks']");
    By selectSortOfLBook = By.xpath("//select[@id='input-sort']");
    By verifyTheProductInOrder = By.xpath("//div[@id='content']//div//div[1]//div[2]//div[1]//p[2]");
    By selectProductMacBook = By.xpath("//a[normalize-space()='MacBook']");
    By verifyMacBookText = By.xpath("//h1[normalize-space()='MacBook']");
    By clickOnAddToCartButton = By.xpath("//button[@id='button-cart']");
    By verifyTheSuccessMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By clickOnLink = By.xpath("//a[normalize-space()='shopping cart']");
    By verifyTextShoppingCard = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By verifyTheMacBookText = By.xpath("//body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By changeTheQty = By.cssSelector("input[value='1']");
    By clickOnUpdateTab = By.xpath("//button[@type='submit']");
    By verifyTheMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By verifyTheTotal = By.xpath("//tbody//tr//td[6]");
    By clickOnCheckOurButton = By.xpath("//a[@class='btn btn-primary']");
    By verifyTextCheckOut = By.xpath("//h1[normalize-space()='Checkout']");
    By verifyTextNewCustomer = By.xpath("//h2[normalize-space()='New Customer']");
    By clickOnGuestCheckoutRadioButton = By.xpath("//input[@value='guest']");
    By clickOnContinueTab = By.xpath("//input[@id='button-account']");

    By fillTheField1 = (By.xpath("//input[@id='input-payment-firstname']"));
    By fillTheField2 = (By.xpath("//input[@id='input-payment-lastname']"));
    By fillTheField3 = (By.xpath("//input[@id='input-payment-email']"));
    By fillTheField4 = (By.xpath("//input[@id='input-payment-telephone']"));
    By fillTheField5 = (By.xpath("//input[@id='input-payment-address-1']"));
    By fillTheField6 = (By.xpath("//input[@id='input-payment-city']"));
    By fillTheField7 = (By.xpath("//input[@id='input-payment-postcode']"));
    By clickOnContinueButton=By.xpath("//input[@id='button-guest']");
    By addCommentOnOrder= By.xpath("//textarea[@name='comment']");
    By clickOnShoppingCard= By.xpath("//input[@id='button-shipping-method']");
    By checkTheTermsConditionsOfCheckBox= By.xpath("//input[@name='agree']");
    By ClickOnContinueButton=By.xpath("//input[@id='button-payment-method']");


    public void mouseHoverOnLapTopAndClick() {
        mouseHoverToElementAndClick(mouseHoverOnLapTopAndClick);

    }

    public void showAllLapTopAndBooks() {
        clickOnElement(showAllLaptopsAndNoteBooks);
    }

    public String verifyTextLaptopAndBooks() {
        return getTextFromElement(verifyTextLaptopsAndBooks);
    }

    public void selectSortOfLBook() {
        selectByVisibleTextFromDropDown(selectSortOfLBook, "Price (High > Low)");
    }

    public String verifyTheProDuctDesOrder() {
        return getTextFromElement(verifyTheProductInOrder);
    }

    public void selectMacBook() {
        clickOnElement(selectProductMacBook);
    }

    public String verifyMacBookTexts() {
        return getTextFromElement(verifyMacBookText);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(clickOnAddToCartButton);

    }

    public String verifyTheSuccessMassegees() {
        return getTextFromElement(verifyTheSuccessMessage);
    }

    public void clickOnLinkShoppingCardLink() {
        clickOnElement(clickOnLink);
    }

    public String verifyTextShoppingCards() {
        return getTextFromElement(verifyTextShoppingCard);
    }

    public String verifyMacBookProduct() {
        return getTextFromElement(verifyMacBookText);
    }

    public void changeTheQty() {
        sendTextToElement(changeTheQty, "2");
    }

    public void clickOnUpdateLink() {
        clickOnElement(clickOnUpdateTab);
    }

    public String verifyMessage() {
        return getTextFromElement(verifyTheMessage);
    }

    public String verifyTheTotal() {
        return getTextFromElement(verifyTheTotal);
    }

    public void clickOnCheckOutButton() {

        clickOnElement(clickOnCheckOurButton);

    }

    public String verifyCheckOutText() {
        return getTextFromElement(verifyTextCheckOut);

    }

    public String verifyTextNewCustomers() {
        return getTextFromElement(verifyTextNewCustomer);
    }

    public void clickOnGuestCheckoutRadioButton() {
        clickOnElement(clickOnGuestCheckoutRadioButton);
    }

    public void clickOnContinueTab() {
        clickOnElement(clickOnContinueTab);
    }

    public void fillTheFieldName() {
        sendTextToElement(fillTheField1, "Alex");

    }

    public void fillTheFieldLastName() {
        sendTextToElement(fillTheField2, "Patel");

    }

    public void fillTheFieldEmail() {
        sendTextToElement(fillTheField3, "AlexPatel66666@gmail.com");


    }
    public void fillTheFieldTelePhone(){
        sendTextToElement(fillTheField4,"+447986738281");
    }
    public void fillTheFieldAddress(){
        sendTextToElement(fillTheField5,"364, norton");
    }
    public void fillTheCity(){
        sendTextToElement(fillTheField6,"London");
    }
    public void fillThePostCode(){
        sendTextToElement(fillTheField7,"kt2 1pl");
    }
    public void clickOnContinueButton2(){
        clickOnElement(clickOnContinueButton);
    }
    public void addComments(){
        sendTextToElement(addCommentOnOrder,"This is comment for test case");
        clickOnElement(clickOnShoppingCard);
    }
    public void CheckTheTermsConditionsOfCheckBox(){
        clickOnElement(checkTheTermsConditionsOfCheckBox);
    }
    public void ClickOnContinueButton(){
        clickOnElement(clickOnContinueButton);
}
}

