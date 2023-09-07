package starter.stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class AddItemStepDefinitions {

    @Given("{actor} is looking at his TODO list")
    public void actor_is_looking_at_his_todo_list(Actor actor){

        throw new PendingException("Implement me");
    }

    @When("{actor} adds {string} to the list")
    public void he_adds_to_the_list(Actor actor, String itemName) {

        throw new PendingException("Implement me");
    }
    @Then("{actor} sees {string} as an item in the TODO list")
    public void he_sees_as_an_item_in_the_todo_list(Actor actor, String expectedItemName) {

        throw new PendingException("Implement me");
    }
}
