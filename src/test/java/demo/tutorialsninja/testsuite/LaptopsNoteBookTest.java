package demo.tutorialsninja.testsuite;

import demo.tutorialsninja.pages.LaptopsAndNotebooksPage;
import demo.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsNoteBookTest extends BaseTest {


    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();



    @Test
    public void test(){
        // 1.1 Mouse hover on the Laptops & Notebooks Tab. and click
        laptopsAndNotebooksPage.mouseHoverOnLapTopAndClick();


        // 1.2 Click on “Show AllLaptops & Notebooks”
        laptopsAndNotebooksPage.showAllLapTopAndBooks();


        // 1.3 Select the Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.selectSortOfLBook();


        // 1.4 Verify the Product price will be arranged in High to Low orders.
//        laptopsNotebookPage.verifyTheProDuctDesOrder();
//        List<WebElement>priceList=laptopsNotebookPage.verifyTheProDuctDesOrder();
//        List<String> actualPriceList = new ArrayList<>();
//        for (WebElement e : priceList) {
//            String price = e.getText().split("\n")[0].replace("$", "").trim();
//            actualPriceList.add(price);
//        }


//        System.out.println(actualPriceList);
//        List<String> expectedPriceList = new ArrayList<>(actualPriceList);
//        Collections.sort(expectedPriceList, Collections.reverseOrder());
//        System.out.println(expectedPriceList);
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {
        // 2.1 Mouse hover on the Laptops & Notebooks Tab and click
        laptopsAndNotebooksPage.mouseHoverOnLapTopAndClick();

        // 2.2 Click on the “Show AllLaptops & Notebooks”
        laptopsAndNotebooksPage.showAllLapTopAndBooks();


        // 2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.selectSortOfLBook();


        // 2.4 Select Product “MacBook”
        laptopsAndNotebooksPage.selectMacBook();


        // 2.5 Verify the text “MacBook”
        laptopsAndNotebooksPage.verifyMacBookTexts();
        String expectedText = "MacBook";
        String actualText = laptopsAndNotebooksPage.verifyMacBookTexts();
        Assert.assertEquals(actualText, expectedText, "Invalid text Of MacBook");


        // 2.6 Click on the ‘Add To Cart’ button
        laptopsAndNotebooksPage.clickOnAddToCartButton();


        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
//        laptopsNotebookPage.verifyTheSuccessMassegees();
//        String expectedMessage="Success: You have added MacBook to your shopping cart!";
//        String actualMessage=laptopsNotebookPage.verifyTheSuccessMassegees();
//        Assert.assertEquals(actualMessage,expectedMessage,"Invalid Message");


        //  2.8 Click on the link “shopping cart” display into the success message
        laptopsAndNotebooksPage.clickOnLinkShoppingCardLink();


        // 2.9 Verify the text "Shopping Cart"
        laptopsAndNotebooksPage.verifyTextShoppingCards();
        String expectedText1 = "Shopping Cart  (0.00kg)";
        String actualText1 = laptopsAndNotebooksPage.verifyTextShoppingCards();
        Assert.assertEquals(actualText1, expectedText1, "Shopping Cart");


        // 2.10 Verify the Product name "MacBook"
        laptopsAndNotebooksPage.verifyMacBookProduct();
        String expectedProductName = "MacBook";
        String actualProductName = laptopsAndNotebooksPage.verifyMacBookProduct();
        Assert.assertEquals(actualProductName, expectedProductName, "Invalid product Name");


        // 2.11 Change the Quantity "2"
        laptopsAndNotebooksPage.changeTheQty();


        // 2.12 Click on the “Update” Tab
        laptopsAndNotebooksPage.clickOnUpdateLink();


        // 2.13 Verify the message “Success: You have modified your shopping cart!”
        laptopsAndNotebooksPage.verifyMessage();
        String expectedMessage = "Success: You have modified your shopping cart!";
        String actualMessage = laptopsAndNotebooksPage.verifyMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "InvalidMessage");


        //  2.14 Verify the Total £737.45
        laptopsAndNotebooksPage.verifyTheTotal();
        String expectedTotal = "£737.45";
        String actualTotal = laptopsAndNotebooksPage.verifyTheTotal();
        Assert.assertEquals(actualTotal, expectedTotal, "Invalid Total");


        //  2.15 Click on the “Checkout” button
        laptopsAndNotebooksPage.clickOnCheckOutButton();


        //  2.16 Verify the text “Checkout”
        laptopsAndNotebooksPage.verifyCheckOutText();


        //  2.17 Verify the Text “New Customer”
        laptopsAndNotebooksPage.verifyTextNewCustomers();


        //  2.18 Click on the “Guest Checkout” radio button
        laptopsAndNotebooksPage.clickOnGuestCheckoutRadioButton();


        //  2.19 Click on “Continue” tab
        laptopsAndNotebooksPage.clickOnContinueTab();


        // 2.20 Fill the mandatory fields
        laptopsAndNotebooksPage.fillTheFieldName();
        laptopsAndNotebooksPage.fillTheFieldLastName();
        laptopsAndNotebooksPage.fillTheFieldEmail();
        laptopsAndNotebooksPage.fillTheFieldTelePhone();
        laptopsAndNotebooksPage.fillTheFieldAddress();
        laptopsAndNotebooksPage.fillTheCity();
        laptopsAndNotebooksPage.fillThePostCode();


        //  2.21 Click on “Continue” Button
        laptopsAndNotebooksPage.clickOnContinueButton2();


        // 2.22 Add Comments About your order into the text area
        laptopsAndNotebooksPage.addComments();


        // 2.23 Check the Terms & Conditions check box
        laptopsAndNotebooksPage.CheckTheTermsConditionsOfCheckBox();


        //  2.24 Click on the “Continue” button
        laptopsAndNotebooksPage.ClickOnContinueButton();


        //  2.25 Verify the message “Warning: Payment methodrequired!”
    }
}

