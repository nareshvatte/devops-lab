package com.devopslab.steps;

import com.devopslab.Calculator;
import io.cucumber.java.en.*;
import static org.assertj.core.api.Assertions.assertThat;

public class AdditionSteps {

    private Calculator calculator;
    private int result;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_numbers(Integer a, Integer b) {
        result = calculator.add(a, b);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(Integer expected) {
        assertThat(result).isEqualTo(expected);
    }
}

