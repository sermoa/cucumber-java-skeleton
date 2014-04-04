package skeleton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    Checkout checkout = new Checkout();

    @Given("^an espresso costs £(\\d+)$")
    public void an_espresso_costs_£(int price) throws Throwable {
        checkout.setPrice("espresso", price);
    }

    @Given("^a croissant costs £(\\d+)$")
    public void a_croissant_costs_£(int price) throws Throwable {
        checkout.setPrice("croissant", price);
    }

    @When("^I sell (\\d+) espressos$")
    public void I_sell_espressos(int quantity) throws Throwable {
        checkout.sellProduct("espresso", quantity);
    }

    @When("^I sell (\\d+) croissants$")
    public void I_sell_croissants(int quantity) throws Throwable {
        checkout.sellProduct("croissant", quantity);
    }

    @Then("^the total should be £(\\d+)$")
    public void the_total_should_be_£(int total) throws Throwable {
        assertEquals(total, checkout.total());
    }
}
