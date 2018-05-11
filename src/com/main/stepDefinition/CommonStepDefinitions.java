package com.main.stepDefinition;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.main.java.Solution;



public class CommonStepDefinitions{


	@When("^: User enters '(.*)' and '(.*)'$")
	public void user_enters_from_date_and_to_date(String fDate, String toDate) throws Throwable {

		/*
		 * Code for entering fromDate and toDate on UI
		 * 
		 */
	}
	@Then("^: User verifies Instrument wise traded volume between the date range'$")
	public void user_verifies_instrument_wise_traded_volume_between_the_date_range() throws Throwable {

		try
		{
			Solution.readTradeFile();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Then("^: User verifies List of instrument not traded between the dates'$")
	public void user_verifies_list_of_instrument_not_traded__between_the_dates() throws Throwable {

		try
		{
			Solution.readInstFile();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

