package com.bancolombia.adidas.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GirlSectionPage {

    public static final Target SUPERHERO_SHOES = Target.the("Item SuperHero Shoe for Girls")
            .locatedBy("//span[text()='Tenis FortaRun Superhéroe']");

    public static final Target SIZE_BUTTON = Target.the("Button to select US 11K size")
            .locatedBy("//span[text()='US 11K']");

    public static final Target ADD_TO_SHOPPING_CART = Target.the("Button to Add item to Shopping Cart")
            .locatedBy("//div[@class='add-to-bag___3wgQk gl-vspace-bpall-medium']//span[text()='Añadir al carrito']");

}
