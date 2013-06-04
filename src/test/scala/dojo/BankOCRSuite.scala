package dojo

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import dojo.BankOCR._

@RunWith(classOf[JUnitRunner])
class BankOCRSuite extends FunSuite {

  test("recognize 1") {
    assert(1 === recognizeOneCharacter(BankOCR.ONE))
  }

  test("recognize 2") {
    assert(2 === recognizeOneCharacter(BankOCR.TWO))
  }

  test("recognize 3") {
    assert(3 === recognizeOneCharacter(BankOCR.THREE))
  }

}
