# language: es
Característica: Consultar Reservas
  Yo como comensal
  Requiero un botón donde pueda ver mis reservas
  Para modificar la reserva o cancelarla


  Escenario:  Consultar reserva exitosa
    Dado Que me encuentro en el modulo de consultar reserva
    Cuando ingreso el codigo de la reserva en el campos correspondiente
    Entonces se consulte y se visualice la informacion de la reserva

  Escenario:  Consulta de reserva fallida
    Dado Que me encuentro en la opcion de consultar reserva
    Cuando no ingreso el codigo de la reserva
    Entonces debo observar un mensaje que me indique que no se pudo consultar la reserva