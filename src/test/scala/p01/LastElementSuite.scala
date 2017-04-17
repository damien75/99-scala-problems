package p01

import org.scalatest.FunSuite

/**
  * Created by damiengoblot on 2017-04-16.
  */
class LastElementSuite extends FunSuite{
  test("last: list"){
    assert(new LastElement().last(List(0, 1, 2, 3, 8, 5)) === 5)
  }

  test("last: empty list"){
    assertThrows[NoSuchElementException](new LastElement().last(List()))
  }
}
