package demo.tutorialsninja.pages;

import demo.tutorialsninja.utilities.Utilities;
import org.openqa.selenium.By;

public class ComponentsPage extends Utilities {

    By mouseHoverAndClickOnComponents=By.xpath("//a[normalize-space()='Components']");
    By showAllComponents=By.xpath("//a[normalize-space()='Show AllComponents']");
    By verifyTheTextComponents=By.xpath("//h2[normalize-space()='Components']");

    public void mouseHoverAndClickOnComponents(){
        mouseHoverToElementAndClick(mouseHoverAndClickOnComponents);
    }
    public void showAllComponents(){
        clickOnElement(showAllComponents);
    }
    public String verifyTextComponents(){
        return getTextFromElement(verifyTheTextComponents);
}


}

