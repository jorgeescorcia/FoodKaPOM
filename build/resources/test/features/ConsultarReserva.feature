# language: es
Característica: Consultar Reservas
  Yo como comensal
  Requiero un botón donde pueda ver mis reservas
  Para modificar la reserva o cancelarla
  Antecedentes:
    Dado Que me encuentro en el modulo de consultar reserva

  Escenario:  Consultar reserva exitosa
    Cuando ingreso en codigo de la reserva en el campos correspondiente
    Entonces se consulte y se visualice la información de la reserva

  Escenario:  Consulta de reserva fallida
    Cuando no ingreso el codigo de la reserva
    Entonces debo observar un mensaje que me indique que no se pudo consultar la reserva