//Create a Scala program by taking two variable from user and display their result in Screen.


object addInputFromUser{
  def main(args:Array[String]){
    println("Enter two numbers for additon:")
    val a=scala.io.StdIn.readInt()
    val b=scala.io.StdIn.readInt()
    println("1st number entered: "+a)
    println("2nd number entered: "+b)
    println("Addition of 1st & 2nd Number is: " + (a+b))
  }
}