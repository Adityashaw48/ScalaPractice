package practice

trait Logger{
  def log(msg:String) //abstract Method
  def genericLog(inputMsg:String)={println(inputMsg)} //Concrete Methods with definition
}

//class traitclass extends Logger{} //use extends instead of 'implements', if multiple traits are to be implemented
//extends loggger with logger1 with logger
//}

//above class definition will give error as it did not have definition
//this had to be defined as abstract class
//abstract class traitclass extends logger{}

class traitclass extends Logger {
  def log(msgs:String)=println(msgs) //no override required
  //to extend a class and trait both , 'extends class with trait with trait2'
  override
  def genericLog(input:String)={println("New Message is:"+input)}
}
object Traitobj extends App{
  var newobj= new traitclass()
  newobj.log("Aditya")
  newobj.genericLog("Call concrete method")
}