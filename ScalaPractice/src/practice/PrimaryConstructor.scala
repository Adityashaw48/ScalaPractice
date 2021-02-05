package practice

class PC {
  var a=0
  println("into the class")
  def setA(inputA:Int)={
    a=inputA
    println("into setA method")
  }
  def getA()={
    println("into getA method")
    a
  }
  println("At the end of the class")
  def setA()={
    a=0
    println("into setA method without any input Argument")
  }
}

object PrimaryConstructor extends App{
  var no = new PC()
  //var no = new PC
  no.a=100 //default setter
  no.setA(20) //defined setter
  println(no.a) //default getter
  println(no.getA) //custom getter
  var onemore=new PC()
  onemore.setA()
  println(onemore.a)
}