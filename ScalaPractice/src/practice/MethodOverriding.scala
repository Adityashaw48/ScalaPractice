package practice


class persons{
  var name=""
  def t1String={getClass.getName+"[Name: "+name}
  def description=println("Name is :"+ name)
}

class emp1 extends persons{
  var salary=0.0;
  //override def t1String(salary:Float)={super.toString()+", salary : " + salary + "]"}
  //override def t11String={super.toString()+",salary:"+ salary +"]"}
  //above is giving error because there is no function with this signature to be overriden.
  //if you are giving a wrong spelling mistake then also it will give you compilation error
  override def t1String={super.toString()+", salary : " + salary + "]"}
  ///def description=println("Name is :"+ name + "with salary: "+salary)
  //above gives error because you are not overridding it.
  override def description=println("Name is :"+ name +"with salary :"+salary)
}
object MethodOverriding extends App{
  var newobj=new emp1
  newobj.name="Aditya"
  newobj.salary=70000000
  println(newobj.toString())
  newobj.description
}