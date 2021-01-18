package com.bancolombia.adidas.tasks;

import com.bancolombia.adidas.interactions.Add;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static com.bancolombia.adidas.userinterfaces.AdidasHomePage.CLOSE_AD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddShoes implements Task {

    public static Performable toShoppingCart() {
        return instrumented(AddShoes.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(CLOSE_AD.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(CLOSE_AD)
                ),
                Add.product()
        );
    }
}
