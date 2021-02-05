package practice

class Inheritence { //parent class
  var name=""
}

class employee extends Inheritence{ //child class
  var salary=0.0
  def classString:String="Employee Name: " + name + ", Salary :"+salary
}

class employeeobj extends App{
  var newemp= new employee
  newemp.name="Aditya"
  newemp.salary=7000000
  println(newemp.classString)
  println(newemp.name)
  println(newemp.salary)
}