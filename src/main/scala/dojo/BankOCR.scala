package dojo

object BankOCR {

  val ONE = """...
              /..|
              /..|
            """.stripMargin('/')

  val TWO = """._.
              /._|
              /|_.
            """.stripMargin('/')

  val THREE = """._.
                /._|
                /._|
            """.stripMargin('/')

  val FOUR = """.s_.
                /._|
                /._|
              """.stripMargin('/')


  def recognizeOneCharacter(character: String): Int = {
    character match {
      case ONE => 1
      case TWO => 2
      case THREE => 3
      case FOUR => 4
      case _ => 9999999
    }
  }
}