package practice

object Utility 
//Utility is a singleton
{
  //An Object or singleton is like a class only, the only difference is that the constructor of object is never going to have any input
  private var currentResNum=0
  def GetCurrentResNum={currentResNum=currentResNum+1; currentResNum}
}

class Abc {
  private var currentResNum=0
  def GetCurrentResNum={currentResNum=currentResNum+1; currentResNum}  
}

object NewObj extends App{
  //var a= new Utility
  //var xyz=new Utility
  
  var r1=Utility.GetCurrentResNum
  var r2=Utility.GetCurrentResNum
  var r3=Utility.GetCurrentResNum
  println("r1: "+r1)
  println("r2: "+r2)
  println("r3: "+r3)
  /*
   * var obj1=new Abc
   * println(obj1.GetCurrentResNum)
   * var obj2=new Abc
   * println(obj2.GetCurrentResNum)
   */
  
}