# language: es

 Característica: Validar boton reserva
    yo como comensal
   requiero que exista un boton de reserva
   para poder realizar una reserva

  @manual-result:passed
   Escenario: Mostrar el boton reserva
    Cuando que me encuentro en la homepage
    Entonces observo el boton de reserva

  @manual-result:passed
   Escenario:Validar caracteristica boton reserva
     Cuando me encuentro en la pagina web
     Entonces debo observar el boton Reserva con color naranja #F0950E y Letra blanca
