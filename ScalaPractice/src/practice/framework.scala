package practice

trait mytrait{
  var msg: String="";
  def printMyMessage(input:String); //abstract method
}

class abcde{
  var arrVar: Array[String]= Array("Hi, I am Aditya","How are you")
  //input is going to have 
  //Trait called mytrait extended
  //method called printMyMessage would be defined
  def myfunc(in:mytrait)
  {
    for(x<-arrVar){
      in.printMyMessage(x)
    }
  }
}
class traitClass1{
  var a=0;
}
class traitClass2 extends mytrait{
  var a=0;
  def printMyMessage(input:String){
    println("Enforcing the framework")
    println(input)
  }
}
class traitClass3 extends mytrait
{
  var a=0;
  def printMyMessage(input:String){
    input.split(" ").foreach(println)
  }
}
object framework extends App{
  var abcobj=new abcde
  var traitclass1obj=new traitClass1
  var traitclass2obj=new traitClass2
  //abcobj.myfunc(traitclass1obj) //not possible as method is not defined
  abcobj.myfunc(traitclass2obj)
  var traitclass3obj = new traitClass3
  abcobj.myfunc(traitclass3obj)
  //abcobj.myfunc(traitclass1obj)
}