package exercises

import org.scalatest.FunSuite

class p21InsertElementToListSuite extends FunSuite {
  test("Should insert element to list and return filled list") {
    assertResult(List(1, 2, 3, 4, 5)) {
      new p21InsertElementToList().insert(List(1, 2, 4, 5), 2, 3)
    }
  }

  test(
    "Should insert element at end of list if index is greater than list length") {
    assertResult(List(1, 2, 3, 4, 5)) {
      new p21InsertElementToList().insert(List(1, 2, 3, 4), 9, 5)
    }
  }

  test("Should support empty lists") {
    assertResult(List(5)) {
      new p21InsertElementToList().insert(List.empty, 3, 5)
    }
  }
}
