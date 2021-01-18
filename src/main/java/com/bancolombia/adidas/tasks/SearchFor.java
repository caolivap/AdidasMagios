package com.bancolombia.adidas.tasks;

import com.bancolombia.adidas.interactions.Select;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchFor implements Task {
    public static Performable girlShoes() {
        return instrumented(SearchFor.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Select.theGirlshoes());
    }
}
