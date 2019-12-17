package exercises

import org.scalatest.FunSuite

class p18SliceListSuite extends FunSuite {
  test("Should slice list between given indices") {
    assertResult(List(3, 4)) {
      new p18SliceList().slice(List(1, 2, 3, 4, 5, 6, 7), 2, 4)
    }
  }

  test("Slice should be empty if indices are out of bounds") {
    assertResult(List.empty) {
      new p18SliceList().slice(List(1, 2, 3), 5, 6)
    }
  }

  test("Slice should return empty list if indices are not given in order") {
    assertResult(List.empty) {
      new p18SliceList().slice(List(1, 2, 3, 4, 5, 6, 7, 8), 4, 2)
    }
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p18SliceList().slice(List.empty, 5, 9)
    }
  }
}
