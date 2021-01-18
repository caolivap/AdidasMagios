package com.bancolombia.adidas.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static com.bancolombia.adidas.userinterfaces.AdidasHomePage.NIÑOS_SECTION;
import static com.bancolombia.adidas.userinterfaces.AdidasHomePage.TENIS_NIÑA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Select implements Interaction {

    public static Performable theGirlshoes() {
        return instrumented(Select.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(NIÑOS_SECTION),
                Click.on(TENIS_NIÑA)
        );
    }
}
