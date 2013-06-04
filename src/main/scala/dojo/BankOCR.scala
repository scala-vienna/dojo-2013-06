package dojo

object BankOCR {

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


  def recognizeOneCharacter(character: String): Int = {
    character match {
      case ONE => 1
      case TWO => 2
      case THREE => 3
      case FOUR => 4
      case FIVE => 5
      case _ => 9999999
    }
  }

  def split(digits: String): List[String] = {
    val lines = digits.split('\n')
    val parts: Array[List[String]] = lines map { line =>
      line.grouped(3).toList
    }
    (for (i <- (0 until parts.head.length))
      yield Seq(parts(0)(i), parts(1)(i), parts(2)(i)).mkString("\n")).toList
  }

  def recognize(digits: String): List[Int] = split(digits) map recognizeOneCharacter
}