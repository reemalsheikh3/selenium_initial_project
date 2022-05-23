package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _06_Validate_ComfyElite_Contact_Us_Page_Send_Button {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.cssSelector("a[data-tccl='ux2.HEADER.header9.Nav.Default.Link.Default.37356.click,click']"));

        if (contactUs.isDisplayed() && contactUs.isEnabled())
            System.out.println("Contact us link in header validation PASSED");
        else System.out.println("Contact us link in header validation FAILED");

        contactUs.click();

        if (driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"))
            System.out.println("Contact us link button validation PASSED");
        else System.out.println("Contact us link button validation FAILED");

        WebElement sendButton = driver.findElement(By.cssSelector("button[data-aid='CONTACT_SUBMIT_BUTTON_REND']"));

        if (sendButton.isDisplayed() && sendButton.isEnabled() && sendButton.getText().equals("SEND"))
            System.out.println("Send button validation PASSED");
        else System.out.println("Send button validation FAILED");

        Driver.quitDriver();
    }
}
