# language: es

Característica: Funcionalidad formulario reserva
  Yo como comensal
  Requiero seleccionar una fecha
  para poder agendar la reserva

  Antecedentes:
    Dado Que me encuentro en el formulario de la reserva

  Escenario:  validar formulario fecha reserva
    Cuando presion el icono del calendario
    Entonces debo observar el calendario para seleccionar la fecha de reserva

  Escenario:  Mostrar horarios de la fecha asignada
    Cuando selecciono la fecha
    Entonces debo observar los horarios disponibles para esa fecha
