package exercises

import org.scalatest.FunSuite

class p26GenerateCombinationsFromListSuite extends FunSuite {
  test("Should return all combinations") {
    assertResult(List(List("a", "b"), List("a", "c"), List("b", "c"))) {
      new p26GenerateCombinationsFromList().combinations(2, List("a", "b", "c"))
    }
  }

  test(
    "Should return an empty list if we're looking for more combinations than the list has") {
    assertResult(List.empty) {
      new p26GenerateCombinationsFromList().combinations(7, List("a", "b", "c"))
    }
  }

  test("Should return an empty list if we're looking for 0 combinations") {
    assertResult(List.empty) {
      new p26GenerateCombinationsFromList().combinations(0, List("a", "b", "c"))
    }
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p26GenerateCombinationsFromList().combinations(0, List.empty)
    }
  }
}
