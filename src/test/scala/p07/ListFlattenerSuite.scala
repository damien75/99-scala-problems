package p07

import org.scalatest.FunSuite

class ListFlattenerSuite extends FunSuite {
  test(
    "Flattener should return a flattened version of a nested list at 1 level") {
    assertResult(List(1, 2, 3, 4, 5, 6, 7)) {
      new ListFlattener().flatten(List(1, List(2, 3), List(4, 5, 6), 7))
    }
  }

  test("Flattener should return same list for a simple list") {
    val l1 = List("ab", "bc", "cd")
    assertResult(l1) { new ListFlattener().flatten(l1) }
  }

  test("Flattener should return flat list for a deeply nested list") {
    assertResult(List(1, 2, 3, 4, 5, 6, 7)) {
      new ListFlattener()
        .flatten(List(1, List(2, List(3, List(4, 5), List(6, List(7))))))
    }
  }
}
