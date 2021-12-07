package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.GoogleHomePage;
import com.crowdar.examples.pages.GoogleSearchResultPage;
import com.crowdar.examples.pages.PageBaseTelular;
import com.crowdar.examples.pages.TeluHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class TeluSteps extends PageSteps {


    @Given("the user is in the Telular page (.*)")
    public void theUserIsInTheTelularPageIp(String ip) {
        PageBaseTelular.BASE_URL=ip;
        Injector._page(TeluHomePage.class).go();
    }

    @When("the  user login in the web site using user and password")
    public void theUserLoginInTheWebSiteUsingUserAndPassword() {
    }


    @And("the user search restart button and click them")
    public void theUserSearchRestartButtonAndClickThem() {
    }

    @Then("the user verify the process of restart its ok")
    public void theUserVerifyTheProcessOfRestartItsOk() {
    }



}
