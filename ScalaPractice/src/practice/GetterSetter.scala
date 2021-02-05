package practice

class GetterSetter {
  var x=0
  // x is declared without private so it is private member of class and we get public getter and setter method for this.
  private var y=0
  //declared as private we get private getter and setter only which can be called only within the class
  def getY()=y
  def getmevalueofY():Int
  ={
    y
  }
  
  //def acessY:Int=y //Getter
  def setY(input:Int)=y=input //setter
  
  def getX={
    x=x+1
    x
  }
}

object abcd extends App{
  var obj= new GetterSetter
  //var obj=new GetterSetter()
  println(obj.x); //public getter
  obj.x=20 //it calls obj.x_=(20) //public setter
  //obj.x_=(20)
  println(obj.x)
  println(obj.getX)
  //obj.x_=(30)
  //println(obj.y) //Not accessed due to private   
  println(obj.getY)
  obj.setY(34)
  println(obj.getY)
  //obj.pi=190
  println(obj.getmevalueofY)
  //println(obj.x * obj.pi)
  //obj.pi=89
  //println(obj.y)
}