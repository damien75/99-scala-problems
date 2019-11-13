package exercises

import org.scalatest.FunSuite

/**
  * Created by damiengoblot on 2017-04-16.
  */
class p02SecondToLastElementSuite extends FunSuite {
  test("secondToLast: list of 1 element raises exception") {
    assertThrows[NoSuchElementException](
      new p02SecondToLastElement().secondToLast(List(1)))
  }

  test("secondToLast: empty list raises exception") {
    assertThrows[NoSuchElementException](
      new p02SecondToLastElement().secondToLast(List()))
  }

  test("secondToLast: return second to last element") {
    assert(
      new p02SecondToLastElement()
        .secondToLast(List(0.45, 245, 536.2, 23)) === 536.2)
  }
}
