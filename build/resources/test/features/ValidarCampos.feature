# language: es
Característica: Validacion de campos del formulario
  Yo como comensal
  Requiero diligenciar un formulario con mi pedido
  Para poder ordenar los platos que deseo

  Escenario:  validar campos obligatorios completos
    Dado Que me encuentro en la opcion de reserva
    Cuando lleno la informacion en los campos obligatorios y doy click en el boton Guardar reserva
    Entonces debo observar que la reserva se ha creado satisfactoriamente

  Escenario:  validar campos obligatorios incompletos
    Dado Que me encuentro en el modulo de reserva
    Cuando no lleno informacion en campos obligatorios
    Entonces debo observar que la reserva no ha sido guardada