#language: es

  Característica: Flujo registro y compra

    Antecedentes:
      Dado El "usuario" abre el sitio de "saucedemo"

      Escenario: Flujo exitoso de compra
        Dado que se registra en la pagina con usuario y contrasena
        Cuando añade dos productos al carrito y revisa el carrito para completar su compra
        Y realiza el checkout y finaliza
        Entonces recibe un mensaje de "THANK YOU FOR YOUR ORDER"


