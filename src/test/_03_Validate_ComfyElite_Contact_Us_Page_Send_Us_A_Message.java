package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _03_Validate_ComfyElite_Contact_Us_Page_Send_Us_A_Message {
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

        WebElement heading2 = driver.findElement(By.xpath("//h2[@data-aid='CONTACT_SECTION_TITLE_REND']"));
        WebElement heading4 = driver.findElement(By.xpath("//h4[text()='Send Us a Message']"));

        if (heading2.isDisplayed() && heading2.getText().equals("Contact Us")) System.out.println("Heading 2 validation is PASSED");
        else System.out.println("Heading 2 validation is FAILED");

        if (heading4.isDisplayed() && heading4.getText().equals("SEND US A MESSAGE")) System.out.println("Heading 4 validation is PASSED");
        else System.out.println("Heading 4 validation is FAILED");

        Driver.quitDriver();
    }
}
