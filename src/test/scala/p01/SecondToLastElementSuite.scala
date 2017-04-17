package p01

import org.scalatest.FunSuite

/**
  * Created by damiengoblot on 2017-04-16.
  */
class SecondToLastElementSuite extends FunSuite{
  test("secondToLast: list of 1 element raises exception"){
    assertThrows[NoSuchElementException](new SecondToLastElement().secondToLast(List(1)))
  }

  test("secondToLast: empty list raises exception"){
    assertThrows[NoSuchElementException](new SecondToLastElement().secondToLast(List()))
  }

  test("secondToLast: return second to last element"){
    assert(new SecondToLastElement().secondToLast(List(0.45, 245, 536.2, 23)) === 536.2)
  }
}
