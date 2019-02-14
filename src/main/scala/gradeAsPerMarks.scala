// Accept name & mark from user, if marks are 100, then a+, 90-99=a, 80-89=b+, 70-79=b, 60-69=c+, 40-59=c, & below 40 Fail.

object gradeAsPerMarks {
  def main(args: Array[String]): Unit = {
    print("Enter you Total Mark: ")
    var m = scala.io.StdIn.readInt()

    if(m>100 || m<0){
      println("Please enter correct Marks")
    }
    else {
      if(m==100){
        println("Grade A+")
      }
      else if(m>=90 && m<100){
        println("Grade A")
      }
      else if(m>=80 && m<90){
        println("Grade B+")
      }
      else if(m>=70 && m<80){
        println("Grade B")
      }
      else if(m>=60 && m<70){
        println("Grade C+")
      }
      else if(m>=40 && m<60){
        println("Grade C")
      }
      else
        println("FAIL")
    }
  }
}
