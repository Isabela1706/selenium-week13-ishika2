package demo.tutorialsninja.pages;

import demo.tutorialsninja.utilities.Utilities;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeskTopsPage extends Utilities {


    By desktopsTab = By.linkText("Desktops");
    By allDeskTopsButton = By.linkText("Show AllDesktops");
    By verifyTextDeskTop = By.xpath("//h2[normalize-space()='Desktops']");
    By sortPosition = (By.id("input-sort"));
    By verifyProductsInDescending = By.xpath("//div[@id='content']//div//div[1]//div[2]//div[1]//h4");
    By currencyDropDown = By.xpath("//button[@class='btn btn-link dropdown-toggle']");
    By poundElement = By.cssSelector("button[name='GBP']");
    By desktopMenu = By.linkText("Desktops");
    By showAllDesktops = By.linkText("Show AllDesktops");
    By sortByPosition = By.id("input-sort");
    By selectProductHP = By.linkText("HP LP3065");
    By verifyTheTextHP = By.xpath("//h1[normalize-space()='HP LP3065']");
    By selectDate = By.xpath("//div[@class='input-group date']//button[@type='button']");
    By enterQty = By.xpath("//input[@id='input-quantity']");
    By addToCartButton = By.xpath("//button[@id='button-cart']");
    By verifyTheMessage = By.xpath("//div[@class='alert alert-success alert-dismissible");
    By clickOnShoppingCardLink = By.xpath("//a[normalize-space()='shopping cart']");
    By verifyTheTextOfShopping = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By verifyTheProductNameHp = By.xpath("/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By verifyTheDeliveryDate = By.cssSelector("body > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > small:nth-child(3)");
    By verifyTheModel = By.xpath("//td[normalize-space()='Product 21']");
    By verifyTheTotal = By.xpath("//tbody//tr//td[6]");


    public void mouseHoverOnDesktops() {
        mouseHoverToElement(desktopsTab);
    }

    public void showAllDeskTops() {
        clickOnElement(allDeskTopsButton);

    }

    public String verifyDeskTop() {
        return getTextFromElement(verifyTextDeskTop);

    }

    public void selectTheSortByName() {
        WebElement sortByElement = driver.findElement(sortPosition);
        Select select = new Select(sortByElement);
        select.selectByVisibleText("Name (Z - A)");
    }


    public void sortProductsInDescendingOrder(){
        List<WebElement> productNames = driver.findElements(verifyProductsInDescending);
        System.out.println(productNames.size());

        List<String> actualNames = new ArrayList<>();
        for (WebElement productName : productNames) {
            actualNames.add(productName.getText().toUpperCase());
        }

        //Create copy of actual array
        List<String> expectedNames = new ArrayList<>(actualNames);
        Collections.sort(expectedNames, Collections.reverseOrder());
        Assert.assertEquals("product names are not displayed in the descending order", expectedNames, actualNames);
    }

    public void currencyDropDown(){
        mouseHoverToElementAndClick(currencyDropDown);

    }

    public void hoverOnPoundAndClick(){
        mouseHoverToElementAndClick(poundElement);
    }

    public void hoverOnDeskTopTab(){
        mouseHoverToElement(desktopMenu);
    }
    public void clickOnAllDesktops(){
        clickOnElement(showAllDesktops);
    }
    public void selectTheProductFromAToZ(){
        WebElement sortByElement = driver.findElement(sortByPosition);
        Select select = new Select(sortByElement);
        select.selectByVisibleText("Name (A - Z)");

    }

    public void selectProductHP(){
        clickOnElement(selectProductHP);
    }

    public String verifyTheTextHp(){
        return getTextFromElement(verifyTheTextHP);
    }

    public void selectDate() {
        String day = "27";
        String month = "November";
        String year = "2024";


        clickOnElement(By.xpath("//div[@class='input-group date']//button[@type='button']"));
        while (true) {
            String monthYear = getTextFromElement(By.xpath("//div[@class='datepicker-days']//th[@class='picker-switch']")); //of Date and year element title in calender
            String[] a = monthYear.split(" "); //Splitting month and year
            String mon = a[0];
            String yer = a[1];
            if (mon.equals(month) && yer.equals(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'›')]"));
            }
        }
        //Select date
        List<WebElement> dates =driver.findElements(By.xpath("//tbody/tr/td[@class='day']"));
        for (WebElement date : dates) {
            System.out.println(date.getText());
            if (date.getText().equals(day)) {
                date.click();
                break;
            }
        }
    }

    public void enterQty(){
        sendTextToElement(enterQty,"1");
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    public String verifyTheMessage(){
        return getTextFromElement(verifyTheMessage);
    }

    public void clickOnShoppingCardLik() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(clickOnShoppingCardLink);
    }

    public String verifyTheTextOfShopping(){
        return getTextFromElement(verifyTheTextOfShopping);

    }

    public String VerifyTheProductNameHp(){
        return getTextFromElement(verifyTheProductNameHp);

    }

    public String verifyTheDeliveryDate1(){
        return getTextFromElement(verifyTheDeliveryDate);

    }

    public String verifyTheModel(){
        return getTextFromElement(verifyTheModel);
    }

    public String verifyTheTotal(){
        return getTextFromElement(verifyTheTotal);

}
}






