package exercises

import org.scalatest.FunSuite

class p14DuplicateListElementsSuite extends FunSuite {
  test("Should duplicate once all elements in list") {
    assertResult(List("a", "a", "b", "b", "c", "c", "d", "d")) {
      new p14DuplicateListElements().duplicate(List("a", "b", "c", "d"))
    }
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p14DuplicateListElements().duplicate(List.empty)
    }
  }
}
