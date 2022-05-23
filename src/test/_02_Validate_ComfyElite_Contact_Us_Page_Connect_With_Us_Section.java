package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _02_Validate_ComfyElite_Contact_Us_Page_Connect_With_Us_Section {
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


        WebElement heading1 = driver.findElement(By.xpath("//h1[@role='heading']//span"));
        WebElement facebookIcon = driver.findElement(By.cssSelector("a[data-aid='SOCIAL_FACEBOOK_LINK']"));
        WebElement instagramIcon = driver.findElement(By.cssSelector("a[data-aid='SOCIAL_INSTAGRAM_LINK']"));


        if (heading1.isDisplayed() && heading1.getText().equals("Connect With Us"))
            System.out.println("Connect with us heading validation PASSED");
        else System.out.println("Connect with us heading validation FAILED");

        if (facebookIcon.isDisplayed() && facebookIcon.isEnabled() && facebookIcon.getAttribute("href").equals("https://www.facebook.com/103179127717601")) {
            System.out.println("Facebook icon and Hyperlink validation is PASSED");
        } else System.out.println("Facebook icon and Hyperlink validation is FAILED");

        if (instagramIcon.isDisplayed() && instagramIcon.isEnabled() && instagramIcon.getAttribute("href").equals("https://www.instagram.com/comfyelite")) {
            System.out.println("Instagram icon and Hyperlink validation is PASSED");
        } else System.out.println("Instagram icon and Hyperlink validation is FAILED");

        Driver.quitDriver();

    }
}
