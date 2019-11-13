package exercises

import org.scalatest.FunSuite

class p09ListGroupConsecutiveDuplicatesSuite extends FunSuite {
  test("Should group consecutive similar elements in sublists") {
    assertResult(
      List(List(1, 1, 1, 1),
           List(2, 2, 2),
           List(3),
           List(4, 4, 4),
           List(5),
           List(6, 6))) {
      new p09ListGroupConsecutiveDuplicates()
        .group(List(1, 1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 6, 6))
    }
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p09ListGroupConsecutiveDuplicates().group(List.empty)
    }
  }
}
