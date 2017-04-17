package p01

import org.scalatest.FunSuite

/**
  * Created by damiengoblot on 2017-04-16.
  */
class LastElementSuite extends FunSuite{
  test("last: list of ints"){
    assert(new LastElement().last(List(0, 1, 2, 3, 8, 5)) === 5)
  }

  test("last: list of strings"){
    assert(new LastElement().last(List("aasdf", "awesrfv", "sfgh", "sdfr", "qer", "ktyufj")) === "ktyufj")
  }

  test("last: empty list"){
    assertThrows[NoSuchElementException](new LastElement().last(List()))
  }

}
