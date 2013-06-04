package dojo

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import dojo.BankOCR._

@RunWith(classOf[JUnitRunner])
class BankOCRSuite extends FunSuite {

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

  test("recognize 1") {
    assert(1 === recognizeOneCharacter(ONE))
  }

  test("recognize 2") {
    assert(2 === recognizeOneCharacter(TWO))
  }

  test("recognize 3") {
    assert(3 === recognizeOneCharacter(THREE))
  }

  test("recognize 4") {
    assert(4 === recognizeOneCharacter(FOUR))
  }

  test("recognize 5")  {
    assert(5 === recognizeOneCharacter(FIVE))
}

}
