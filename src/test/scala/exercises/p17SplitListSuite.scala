package exercises

import org.scalatest.FunSuite

class p17SplitListSuite extends FunSuite {
  test("Should split list at given index") {
    assertResult((List(1, 2, 3, 4), List(5, 6, 7))) {
      new p17SplitList().split(List(1, 2, 3, 4, 5, 6, 7), 4)
    }
  }

  test("Second list should be empty if split index is greater than list length") {
    assertResult((List(1, 2, 3), List.empty)) {
      new p17SplitList().split(List(1, 2, 3), 5)
    }
  }

  test("Should support empty lists") {
    assertResult((List.empty, List.empty)) {
      new p17SplitList().split(List.empty, 5)
    }
  }
}
