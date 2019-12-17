package exercises

import org.scalatest.FunSuite

class p22RangeListSuite extends FunSuite {
  test("Should create a list with the requested range") {
    assertResult(List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12)) {
      new p22RangeList().range(3, 13)
    }
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p22RangeList().range(4, 4)
    }
  }
}
