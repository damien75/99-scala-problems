package exercises

import org.scalatest.FunSuite

class p19RotateListSuite extends FunSuite {
  test("Should rotate list given number of times") {
    assertResult(List(3, 4, 1, 2)) {
      new p19RotateList().rotate(List(1, 2, 3, 4), 2)
    }
  }

  test("Should support rotations greater than size of list") {
    assertResult(List(3, 4, 1, 3)) {
      new p19RotateList().rotate(List(1, 3, 3, 4), 10)
    }
  }

  test("List should be the same if rotations modulo size of list is equal to 0") {
    assertResult(List(1, 3, 5, 7, 9)) {
      new p19RotateList().rotate(List(1, 3, 5, 7, 9), 5)
    }
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p19RotateList().rotate(List.empty, 9)
    }
  }
}
