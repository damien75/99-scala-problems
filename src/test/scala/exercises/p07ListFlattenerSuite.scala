package exercises

import org.scalatest.FunSuite

class p07ListFlattenerSuite extends FunSuite {
  test(
    "Flattener should return a flattened version of a nested list at 1 level") {
    assertResult(List(1, 2, 3, 4, 5, 6, 7)) {
      new p07ListFlattener().flatten(List(1, List(2, 3), List(4, 5, 6), 7))
    }
  }

  test("Flattener should return same list for a simple list") {
    val l1 = List("ab", "bc", "cd")
    assertResult(l1) { new p07ListFlattener().flatten(l1) }
  }

  test("Flattener should return flat list for a deeply nested list") {
    assertResult(List(1, 2, 3, 4, 5, 6, 7)) {
      new p07ListFlattener()
        .flatten(List(1, List(2, List(3, List(4, 5), List(6, List(7))))))
    }
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p07ListFlattener().flatten(List.empty)
    }
  }
}
