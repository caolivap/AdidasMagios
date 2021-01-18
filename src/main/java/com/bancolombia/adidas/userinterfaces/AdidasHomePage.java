package com.bancolombia.adidas.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AdidasHomePage {

    public static final Target NIÑOS_SECTION = Target.the("Label of Children Section")
            .locatedBy("//a[contains(text(), 'NIÑOS')]");

    public static final Target TENIS_NIÑA = Target.the("Label of Girl Shoes")
            .locatedBy("//a[text()='Tenis niña' and contains(@manual_cm_sp, 'header-_-niños-_-niños')]");

    public static final Target CLOSE_AD = Target.the("Button for close Ad")
            .locatedBy("//button[@aria-label='Cerrar']");

}
