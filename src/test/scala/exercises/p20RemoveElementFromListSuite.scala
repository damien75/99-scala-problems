package exercises

import org.scalatest.FunSuite

class p20RemoveElementFromListSuite extends FunSuite {
  test("Should remove element from list and return it in Tuple") {
    assertResult((List(1, 2, 3, 5), 4)) {
      new p20RemoveElementFromList().remove(List(1, 2, 3, 4, 5), 3)
    }
  }

  test(
    "Should throw IndexOutOfBoundsException if trying to remove element at index out of bounds") {
    assertThrows[NoSuchElementException](
      new p20RemoveElementFromList().remove(List(1, 2, 3), 3))
  }

  test("Should throw an exception for empty lists") {
    assertThrows[NoSuchElementException](
      new p20RemoveElementFromList().remove(List.empty, 2))
  }
}
