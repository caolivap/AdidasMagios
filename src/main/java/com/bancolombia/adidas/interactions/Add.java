package com.bancolombia.adidas.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static com.bancolombia.adidas.userinterfaces.GirlSectionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Add implements Interaction {

    public static Performable product() {
        return instrumented(Add.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(SUPERHERO_SHOES)
        );
    }
}
