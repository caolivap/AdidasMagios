package com.bancolombia.adidas.stepdefinitions;

import com.bancolombia.adidas.tasks.OpenThe;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class CarritoDeComprasStepDefinitions {

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que (.*) está en la página oficial de Adidas$")
    public void queCarlosEstoyEnLaPáginaOficialDeAdidas(String nombreActor) {
        theActorCalled(nombreActor).wasAbleTo(
            OpenThe.adidasPage()
        );
    }


    @When("^busco tenis de niña y los agrego al carrito de compras$")
    public void buscoTenisDeNiñaYLosAgregoAlCarritoDeCompras() {

    }

    @Then("^los tenis son añadidos correctamente al carrito de compras$")
    public void losTenisSonAñadidosCorrectamenteAlCarritoDeCompras() {

    }


}
