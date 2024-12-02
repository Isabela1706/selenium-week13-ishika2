package demo.tutorialsninja.testsuite;

import demo.tutorialsninja.pages.ComponentsPage;
import demo.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComponentsTest extends BaseTest {


    ComponentsPage componentsPage = new ComponentsPage();

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){


        //Mouse hover on the “Components” Tab and click
        componentsPage.mouseHoverAndClickOnComponents();

        //call the method and pass the menu = “Show AllComponents”
        componentsPage.showAllComponents();

        //Verify the text ‘Components’
        String expectedText = "Components";
        String actualText = componentsPage.verifyTextComponents();
        Assert.assertEquals(actualText, expectedText, "Invalid Text");



    }
}
