package com.infoplus.grc.accelus.regint.bdd.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Driver {

    public static WebDriver driver;

    /**
     * Fires up a firefox browser which is then used by the pageObjects to trigger browser events.
     */
    public static void initialiseDriver(){
           driver = new FirefoxDriver();
		//driver = new SafariDriver();
		//driver = new ChromeDriver();
        }

    }

