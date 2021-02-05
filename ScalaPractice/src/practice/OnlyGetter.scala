package practice

class OnlyGetter {
  val pi=3.14 //We will get only default getter and no setter for this 
  private var balance=0 //in the case of private variable, scala defines the getter and setter
  //method which are private
  def setBalance(moneyAdded:Int)={balance=balance+moneyAdded}
  def getBalance()={balance}
}

object onlyGetterMain extends App
{
  var a=new OnlyGetter
  println(a.pi) //default getter
  //a.pi=5
  println(a.getBalance())
  a.setBalance(6879)
  println(a.getBalance())
}