package com.infoplus.grc.accelus.regint.bdd.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.infoplus.grc.accelus.regint.bdd.support.Driver;
import com.infoplus.grc.accelus.regint.bdd.selectors.GoogleSelectors;

public class Google extends Driver {

    public static void navigateToGooglePage(){
        driver.get(GoogleSelectors.GOOGLE_HOME_PAGE);
    }
    public static void clickOnLink(String linkText1){
        driver.findElement(By.linkText(linkText1)).click();
    }
 
    public static void fillValuesInCreateGmailAccountPage(String firstName, String lastName, String username, String password, String confirmPassword, String month, String day, String year, String gender, String phone, String currentEmail, String skipVerification, String location, String agree) throws InterruptedException{
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
        driver.findElement(By.id("LastName")).sendKeys(lastName);
        driver.findElement(By.id("GmailAddress")).sendKeys(username);
        driver.findElement(By.id("Passwd")).sendKeys(password);
        driver.findElement(By.id("PasswdAgain")).sendKeys(confirmPassword);
        Thread.sleep(2000);        
        WebElement elem = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/form/div[5]/fieldset/label[1]/span/div"));
        String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";

        ((JavascriptExecutor) driver).executeScript(js, elem);
        elem.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/form/div[5]/fieldset/label[1]/span/div[2]/div[4]")).click();;
        Thread.sleep(1000);
        driver.findElement(By.id("BirthDay")).sendKeys(day);
        Thread.sleep(1000);
         driver.findElement(By.id("BirthYear")).sendKeys(year);
         Thread.sleep(1000);
                 
         WebElement elem1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/form/div[6]/label/div/div[1]"));
         String js1 = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
         ((JavascriptExecutor) driver).executeScript(js1, elem1);
         elem1.click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/form/div[6]/label/div/div[2]/div[2]")).click();;
         Thread.sleep(1000);
         driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys(phone);
         Thread.sleep(1000);
         driver.findElement(By.id("RecoveryEmailAddress")).sendKeys(currentEmail);
         Thread.sleep(1000);
         driver.findElement(By.id("SkipCaptcha")).click();
         Thread.sleep(1000);
         driver.findElement(By.id("TermsOfService")).click();
         
    }
 

    public static void clickOnGmailSignupPageSubmitButton() throws InterruptedException{
         driver.findElement(By.id("submitbutton")).click();
         Thread.sleep(2000);
    }

    
    
    
    
    
    public static boolean googleErrorResultForNoUserName() throws InterruptedException{
    	Boolean errorDisplayed = false;    	
        Thread.sleep(2000);
        if(driver.findElement(By.id("errormsg_0_GmailAddress")).getText().equalsIgnoreCase("You can't leave this empty.")){
        	errorDisplayed = true;
        }
        Thread.sleep(1000);
    	return errorDisplayed;
    }    
}
