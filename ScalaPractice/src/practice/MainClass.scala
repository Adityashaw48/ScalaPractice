package practice

class SecondClass {
  var a =10
  var b =200 //Attributes
  
  def getA():Int //Method//Behaviour//Getter
  ={
    a
  }
  def setA(input: Int) //Method//Behaviour//Getter
  ={
    a = input
  }
  def getB():Int //Method//Behaviour//Getter
  ={
    b
  }
  def setB(input: Int) //Method//Behaviour//Getter
  ={
    b = input
  }  
}

object xyz extends App{
  var newObj= new SecondClass()
  println(newObj.getA)
  println(newObj.getB)
  newObj.setA(1000)
  newObj.setB(2000)
  println(newObj.getA)
  println(newObj.getB)
}