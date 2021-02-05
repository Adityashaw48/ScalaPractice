package practice

case class Person(firstName: String,lastName:String)
case class Person1(var name:String)
object CaseClass extends App{
  var p1= new Person("Aditya","Shaw")
  //p1.firstName="Piyush"
  var firstName=p1.firstName
  var lastName=p1.lastName
  //p1.firstName="yash" //this gives error as firstName is val or read only
  //p1.firstName="Atul"//Not Possible because all the items of case class are defined as val
  
  var bj= new Person1("Aaditya")
  bj.name="BJ"
  println(bj.name)
  //
  if(p1 == Person(firstName,lastName))
  {
    println("Found Myself")
    println(p1.firstName)
    println(p1.lastName)
  }
  println(p1.firstName)
  println(p1.lastName)
}