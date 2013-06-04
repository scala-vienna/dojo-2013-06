package dojo

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import dojo.BankOCR._

@RunWith(classOf[JUnitRunner])
class BankOCRSuite extends FunSuite {



  val TWENTYONE = """._....
                    /._|..|
                    /|_...|""".stripMargin('/')

  val FOURTYTHREE = """...._.
                      /|_|._|
                      /..|._|""".stripMargin('/')

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

  test("test the dot-to-space converter") {
    assert("x..x".convert() === "x  x")
  }

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
  test("split 21")  {
    val out = split(TWENTYONE)
    assert(out.head === TWO)
    assert(out.tail.head === ONE)
  }

  test("split 43")  {
    val out = split(FOURTYTHREE)
    assert(out.head === FOUR)
    assert(out.tail.head === THREE)
  }

  test("recognizee 43") {
    assert(List(4, 3) === recognize(FOURTYTHREE))
  }
  test("read file with numbers") {
    val iter = scala.io.Source.fromInputStream(getClass().getResourceAsStream("/1234"))

  }
}
