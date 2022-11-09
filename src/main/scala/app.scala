//funcion anonima ==>  val operar = (x: Int, y: Int)=> x+y es anonima porque se asigna a una variable
//funcion nombrada ==>
//tipos de datos basados en clases
// case == crear un tipo de dato ==> case class Person(name: String) val p = Perosn("Jose")  p.name ==> Jose
val operar = (x: Int, y: Int)=> x+y
@main def app(): Unit =
  println("Hola, mundo!!!!")
  println(operar(2,5))
  //las listas se las declaran como clases

