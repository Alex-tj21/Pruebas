#language: es
  Característica: Diligenciar formulario
    Como estudiante
    Quiero
    Para
  Esquema del escenario: Diligenciar formulario
    Cuando Se diligencie el formulario '<email>' '<nombre>' '<mensaje>'
    Entonces se valida que sea exitoso

    Ejemplos:
    |email       |nombre|mensaje     |
    |aa@gmail.com|pepe  |cuando venga|