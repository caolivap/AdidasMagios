Feature: Añadir tenis al carrito de compras
  Yo como usuario de Adidas
  Quiero poder añadir tenis al carrito de compras
  Para poder comprarlos después


  Scenario: Añadir tenis de niña al carrito de compras
    Given que Carlos está en la página oficial de Adidas
    When busco tenis de niña y los agrego al carrito de compras
    Then los tenis son añadidos correctamente al carrito de compras


