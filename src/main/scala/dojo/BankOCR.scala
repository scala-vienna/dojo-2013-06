package dojo

object BankOCR {

  implicit class MyString(str:String) {
    def convert() = {
      str.stripMargin('/').replaceAll("\\.", " ")
    }
  }

  val ONE = """...
              /..|
              /..|""".stripMargin('/')

  val TWO = """._.
              /._|
              /|_.""".stripMargin('/')

  val THREE = """._.
                /._|
                /._|""".stripMargin('/')

  val FOUR = """...
               /|_|
               /..|""".stripMargin('/')
 val FIVE = """._.
               /|_.
               /._|""".stripMargin('/')


  def recognizeDigit(character: String): Int = {
    character match {
      case ONE => 1
      case TWO => 2
      case THREE => 3
      case FOUR => 4
      case FIVE => 5
      case _ => throw new IllegalArgumentException("Unrecognized digit")
    }
  }

  def split(digits: String): List[String] = {
    val lines = digits.split('\n')
    val parts = lines map { line =>
      line.grouped(3).toList
    }
    val result = (for (i <- (0 until parts.head.length))
      yield Seq(parts(0)(i),
        parts(1)(i),
        parts(2)(i)).mkString("\n"))

    result.toList
  }

  def recognize(digits: String): List[Int] = split(digits) map recognizeDigit
}