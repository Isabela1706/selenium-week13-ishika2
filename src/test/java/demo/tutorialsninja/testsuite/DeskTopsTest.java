package demo.tutorialsninja.testsuite;

import demo.tutorialsninja.pages.DeskTopsPage;
import demo.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeskTopsTest extends BaseTest {


    DeskTopsPage deskTopsPage = new DeskTopsPage();
@Test
    public void verifyProductArrangeInAlphaBaticalOrder(){

    //Mouse hover on the Desktops Tab. and click
    deskTopsPage.mouseHoverOnDesktops();


    //Click on “Show AllDesktops”
    deskTopsPage.showAllDeskTops();

    //1.3 Select Sort By position "Name: Z to A"
    deskTopsPage.selectTheSortByName();

    //1.4 Verify the Product will be arranged in Descending order.
    deskTopsPage.sortProductsInDescendingOrder();

}
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        Thread.sleep(3000);

        //Mouse hover on the Currency Dropdown and click
        deskTopsPage.currencyDropDown();


        //Mouse hover on the £Pound Sterling and click
        deskTopsPage.hoverOnPoundAndClick();


        //Mouse hover on the Desktops Tab.
        deskTopsPage.hoverOnDeskTopTab();

        //Click on “Show AllDesktops”
        deskTopsPage.clickOnAllDesktops();


        //Select the Sort By position "Name: A to Z"
        deskTopsPage.selectTheProductFromAToZ();


        //Select product “HP LP3065”
        deskTopsPage.selectProductHP();


        //Verify the Text "HP LP3065"
//        String expectedTextMessage = "HP LP3065";
//        String actualTextMessage = deskTopsPage.verifyDeskTop();
//        Assert.assertEquals(actualTextMessage, expectedTextMessage, "Wrong message display");



        //Select Delivery Date "2024-11-27"
        deskTopsPage.selectDate();


        //Enter Qty "1” using Select class.
        deskTopsPage.enterQty();

        //Click on the “Add to Cart” button
        deskTopsPage.clickOnAddToCartButton();

        //Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
//        String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!";
//        String actualMessage = deskTopsPage.verifyTheMessage();
//        Assert.assertEquals(actualMessage, expectedMessage, "Wrong message display");




        //Click on the link “shopping cart” displayed in a success message
        Thread.sleep(3000);
        deskTopsPage.clickOnShoppingCardLik();



        //Verify the text "Shopping Cart"
        String expectedCartMessage = "Shopping Cart";
        String actualCartMessage = deskTopsPage.verifyTheTextOfShopping();
        Assert.assertEquals(actualCartMessage, expectedCartMessage, "Wrong message display");


        //Verify the Product name "HP LP3065"
        String expectedProductName = "HP LP3065";
        String actualProductName = deskTopsPage.VerifyTheProductNameHp();
        Assert.assertEquals(actualProductName, expectedProductName, "Wrong message display");



        //Verify the Delivery Date "2024-11-27"
        String expectedDeliveryDate = "2024-11-27";
        String actualDeliveryDate = deskTopsPage.verifyTheDeliveryDate1();
        Assert.assertEquals(actualDeliveryDate, expectedDeliveryDate, "Wrong message display");


        //Verify the Model "Product21"
        String expectedModel = "Product 21";
        String actualModel = deskTopsPage.verifyTheModel();
        Assert.assertEquals(actualModel, expectedModel, "Wrong message display");


        //Verify the Total "£74.73"
        String expectedTotal = "£74.73";
        String actualTotal = deskTopsPage.verifyTheTotal();
        Assert.assertEquals(actualTotal, expectedTotal, "Wrong message display");














    }
}
