package com.infoplus.grc.accelus.regint.bdd.stepdefinitions;

import org.junit.Assert;
import com.infoplus.grc.accelus.regint.bdd.pageobjects.*;
import com.infoplus.grc.accelus.regint.bdd.selectors.GoogleSelectors;

import cucumber.api.java.en.*;


public class GoogleStepDef {
  
       		@Given("^I am on Google mail signup page and enter all details except username$")
    		public void clicksTextEntryOnGoogle() throws Throwable {
    			Google.navigateToGooglePage();
    			Google.clickOnLink(GoogleSelectors.GOOGLE_MAIL_LINK);
    			Google.clickOnLink(GoogleSelectors.GOOGLE_MAIL_CREATE_ACCOUNT);
    			Google.fillValuesInCreateGmailAccountPage("Vijayya", "Yanamamandradd", "", "Google@200", "Google@200", "Jan", "1", "1990", "Male", "7766554433", "abbbc@abbbc.com", "yes", "United Kingdom", "yes");
    			
    		}

    		@When("^I click on a button to navigate to next page$")
    		public void I_click_on_a_button_to_navigate_to_next_page() throws Throwable {
    			Google.clickOnGmailSignupPageSubmitButton();
    		}

    		@Then("^an error is displayed$")
    		public void an_error_is_displayed() throws Throwable {
    	    	Assert.assertTrue("Expected error NOT displayed. ", Google.googleErrorResultForNoUserName());    	
    		}

    
    
    
    
    
    
}
