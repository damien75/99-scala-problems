package exercises

import org.scalatest.FunSuite

class p15NDuplicateListElementsSuite extends FunSuite {
  test("Should duplicate once all elements in list") {
    assertResult(
      List("a", "a", "a", "b", "b", "b", "c", "c", "c", "d", "d", "d")) {
      new p15nDuplicateListElements().duplicate(3, List("a", "b", "c", "d"))
    }
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p14DuplicateListElements().duplicate(List.empty)
    }
  }
}
