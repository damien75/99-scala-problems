package exercises

import org.scalatest.FunSuite

class p23SelectRandomeElementsFromListSuite extends FunSuite {
  test(
    "Should select random distinct elements from list and return them as a list") {
    val selection =
      new p23SelectRandomElementsFromList().select(List(1, 2, 3, 4, 5), 3)
    assertResult(3)(selection.size)
    assertResult(3)(selection.toSet.size)
  }

  test(
    "Throws NoSuchElementFound if asking for more elements than the list contains") {
    assertThrows[NoSuchElementException](
      new p23SelectRandomElementsFromList().select(List(1, 2, 3), 5))
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p23SelectRandomElementsFromList().select(List.empty, 0)
    }
  }
}
